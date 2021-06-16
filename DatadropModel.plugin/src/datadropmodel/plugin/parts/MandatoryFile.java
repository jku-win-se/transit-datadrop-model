package datadropmodel.plugin.parts;

/***
 * Helper class for temporary storing mandatory file representations.
 * 
 * @author Marco
 *
 */
public class MandatoryFile {

	private String type;
	private String file;
	private String extension;

	public MandatoryFile(String type, String file, String extension) {
		super();
		this.type = type;
		this.file = file;
		this.extension = extension;
	}

	public String getType() {
		return type;
	}

	public String getFile() {
		return file;
	}

	public String getExtension() {
		return extension;
	}

	public void setType(String type) {
		this.type = type;
	}

	public void setFile(String file) {
		this.file = file;
	}

	public void setExtension(String extension) {
		this.extension = extension;
	}

}
