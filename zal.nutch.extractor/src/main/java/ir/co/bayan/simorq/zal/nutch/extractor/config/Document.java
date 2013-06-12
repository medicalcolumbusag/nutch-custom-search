package ir.co.bayan.simorq.zal.nutch.extractor.config;

import java.util.List;
import java.util.regex.Pattern;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlIDREF;

/**
 * @author Taha Ghasemi <taha.ghasemi@gmail.com>
 * 
 */
public class Document {

	private String url;
	private Pattern urlPattern;

	@XmlElement(name = "extract-to")
	private List<ExtractTo> extractTos;

	@XmlAttribute
	@XmlID
	private String id;

	@XmlAttribute
	@XmlIDREF
	private Document inherits;

	@XmlAttribute(name = "partition-by")
	private String partitionBy;

	@XmlAttribute
	private String engine;

	/**
	 * @return the url
	 */
	public String getUrl() {
		return url;
	}

	/**
	 * @return the urlPattern
	 */
	public Pattern getUrlPattern() {
		return urlPattern;
	}

	/**
	 * @param url
	 *            the url to set
	 */
	@XmlAttribute
	public void setUrl(String url) {
		this.url = url;
		this.urlPattern = Pattern.compile(url);
	}

	public List<ExtractTo> getExtractTos() {
		return extractTos;
	}

	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @return the inherits
	 */
	public Document getInherits() {
		return inherits;
	}

	/**
	 * @return the selector
	 */
	public String getPartitionBy() {
		return partitionBy;
	}

	/**
	 * @return the engine
	 */
	public String getEngine() {
		return engine;
	}

}
