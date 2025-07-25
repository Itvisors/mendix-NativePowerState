// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package datawidgets.proxies;

public enum Filter_Operators
{
	contains("d370eb04-061e-4acd-b3d6-44a8c9ed3860"),
	startsWith("728a32b6-7f85-4762-8f81-6b37dfdd6315"),
	endsWith("249cfd79-14f0-4446-b44c-939b6fe0842f"),
	between("92f813ae-ad74-4e8c-8be6-9d79245cbf7f"),
	greater("f79af7ff-9d86-4311-8c5d-b0639ab80edb"),
	greaterEqual("9b95e8d4-05a3-49cf-b7ec-6640e526d88b"),
	equal("85e2b115-c7c7-4f9e-8a0c-ca5483f5930f"),
	notEqual("d038337e-a174-4bd1-9952-d0aa193064b0"),
	smaller("3ffe7873-d70a-4f43-b380-9d6e90216441"),
	smallerEqual("e4013c72-7a1d-423a-9451-633682ec49dc"),
	empty("279c42c7-c9c7-4deb-aefb-c62f51e10ea6"),
	notEmpty("9b730fed-9ece-4574-a700-8f8d95d95157");

	private final java.lang.String i18nCaptionKey;
	
	private Filter_Operators(java.lang.String i18nCaptionKey)
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
