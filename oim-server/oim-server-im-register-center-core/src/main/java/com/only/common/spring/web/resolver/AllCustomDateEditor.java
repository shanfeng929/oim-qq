package com.only.common.spring.web.resolver;

import java.text.DateFormat;
import java.text.ParseException;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.util.StringUtils;

/**
 * @author: XiaHui
 * @date: 2017年3月29日 上午10:27:00
 */
public class AllCustomDateEditor extends CustomDateEditor {

	private DateFormat dateFormat;
	private boolean allowEmpty;
	private int exactDateLength;

	public AllCustomDateEditor(DateFormat dateFormat, boolean allowEmpty) {
		super(dateFormat, allowEmpty);
		this.dateFormat = dateFormat;
		this.allowEmpty = allowEmpty;
		this.exactDateLength = -1;
	}

	public AllCustomDateEditor(DateFormat dateFormat, boolean allowEmpty, int exactDateLength) {
		super(dateFormat, allowEmpty);
		this.dateFormat = dateFormat;
		this.allowEmpty = allowEmpty;
		this.exactDateLength = exactDateLength;
	}

	@Override
	public void setAsText(String text) throws IllegalArgumentException {
		if (this.allowEmpty && !StringUtils.hasText(text)) {
			// Treat empty String as null value.
			setValue(null);
		} else if (text != null && this.exactDateLength >= 0 && text.length() != this.exactDateLength) {
			throw new IllegalArgumentException("Could not parse date: it is not exactly" + this.exactDateLength + "characters long");
		} else {
			try {
				text = text.replaceAll("[/\\.]", "-");// .,/格式全部转化成-间隔
				if (text.matches("\\d{4}")) {// 只有年份，补全月日时分秒
					text += "-01-01 00:00:00";
				} else if (text.matches("\\d{4}-\\d{1,2}")) {// 只有年月，补全日时分秒
					text += text + "-01 00:00:00";
				}
				if (text.matches("\\d{4}-\\d{1,2}-\\d{1,2}")) {// 只有年月日，补全时分秒
					text += " 00:00:00";
				} else if (text.matches("\\d{4}-\\d{1,2}-\\d{1,2} \\d{1,2}")) {// 只有年月日时，补全分秒
					text += ":00:00";
				} else if (text.matches("\\d{4}-\\d{1,2}-\\d{1,2} \\d{1,2}:\\d{1,2}")) {// 只有年月日时分，补全秒
					text += ":00";
				}

				setValue(this.dateFormat.parse(text));
			} catch (ParseException ex) {
				throw new IllegalArgumentException("Could not parse date: " + ex.getMessage(), ex);
			}
		}
	}

}
