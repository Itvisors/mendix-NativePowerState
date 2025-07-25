// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package system.proxies;

public enum WorkflowUserTaskCompletionType
{
	Single("fb1e943b-f7b9-40a5-9ac6-1c1195201862"),
	Veto("d8f0ca51-4e06-4e1c-88b7-1334d58f2468"),
	Consensus("70453f11-76eb-4316-b8ee-f30c990ea4a7"),
	Majority("69fc65de-57df-40e4-8550-c580d3a8d284"),
	Threshold("ec83101b-8232-4767-9911-adad20dd645e"),
	Microflow("7eed3eeb-0fc3-43b0-bb25-f4001c517521");

	private final java.lang.String i18nCaptionKey;
	
	private WorkflowUserTaskCompletionType(java.lang.String i18nCaptionKey)
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
