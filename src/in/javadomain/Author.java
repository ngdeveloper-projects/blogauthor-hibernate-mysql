package in.javadomain;

public class Author {

	private int authorID;

	private String authorName;

	// Composite class - Required entry added in the Author.hbm.xml
	private SiteInfo siteInfo = new SiteInfo();

	public int getAuthorID() {
		return authorID;
	}

	public void setAuthorID(int authorID) {
		this.authorID = authorID;
	}

	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	public SiteInfo getSiteInfo() {
		return siteInfo;
	}

	public void setSiteInfo(SiteInfo siteInfo) {
		this.siteInfo = siteInfo;
	}

}