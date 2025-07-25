// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package nanoflowcommons.proxies;

public enum Platform
{
	Web("85c6c7b8-5ed5-45f5-bf28-9a199a4a5185"),
	Native_mobile("1e69c164-dc94-4e8a-adee-4cf56b040e98"),
	Hybrid_mobile("144b0d42-66fb-4750-b129-1bfea804f4ac");

	private final java.lang.String i18nCaptionKey;
	
	private Platform(java.lang.String i18nCaptionKey)
	{
		this.i18nCaptionKey = i18nCaptionKey;
	}

	public java.lang.String getCaption(java.lang.String languageCode)
	{
		String caption = com.mendix.core.Core.getInternationalizedString(languageCode, i18nCaptionKey);
		return caption.isEmpty() ? getCaption() : caption;
	}

	public java.lang.String getCaption()
	{
		return com.mendix.core.Core.getInternationalizedString("en_US", i18nCaptionKey);
	}
}
