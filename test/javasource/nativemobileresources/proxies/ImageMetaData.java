// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package nativemobileresources.proxies;

public class ImageMetaData
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject imageMetaDataMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "NativeMobileResources.ImageMetaData";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		PictureTaken("PictureTaken"),
		URI("URI"),
		IsVertical("IsVertical"),
		Width("Width"),
		Height("Height"),
		FileName("FileName"),
		FileSize("FileSize"),
		FileType("FileType");

		private final java.lang.String metaName;

		MemberNames(java.lang.String s)
		{
			metaName = s;
		}

		@java.lang.Override
		public java.lang.String toString()
		{
			return metaName;
		}
	}

	public ImageMetaData(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, entityName));
	}

	protected ImageMetaData(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject imageMetaDataMendixObject)
	{
		if (imageMetaDataMendixObject == null) {
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		}
		if (!com.mendix.core.Core.isSubClassOf(entityName, imageMetaDataMendixObject.getType())) {
			throw new java.lang.IllegalArgumentException(String.format("The given object is not a %s", entityName));
		}	

		this.imageMetaDataMendixObject = imageMetaDataMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'ImageMetaData.load(IContext, IMendixIdentifier)' instead.
	 */
	@java.lang.Deprecated
	public static nativemobileresources.proxies.ImageMetaData initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return nativemobileresources.proxies.ImageMetaData.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 * @param context The context to be used
	 * @param mendixObject The Mendix object for the new instance
	 * @return a new instance of this proxy class
	 */
	public static nativemobileresources.proxies.ImageMetaData initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new nativemobileresources.proxies.ImageMetaData(context, mendixObject);
	}

	public static nativemobileresources.proxies.ImageMetaData load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return nativemobileresources.proxies.ImageMetaData.initialize(context, mendixObject);
	}

	/**
	 * Commit the changes made on this proxy object.
	 * @throws com.mendix.core.CoreException
	 */
	public final void commit() throws com.mendix.core.CoreException
	{
		com.mendix.core.Core.commit(context, getMendixObject());
	}

	/**
	 * Commit the changes made on this proxy object using the specified context.
	 * @throws com.mendix.core.CoreException
	 */
	public final void commit(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		com.mendix.core.Core.commit(context, getMendixObject());
	}

	/**
	 * Delete the object.
	 */
	public final void delete()
	{
		com.mendix.core.Core.delete(context, getMendixObject());
	}

	/**
	 * Delete the object using the specified context.
	 */
	public final void delete(com.mendix.systemwideinterfaces.core.IContext context)
	{
		com.mendix.core.Core.delete(context, getMendixObject());
	}
	/**
	 * @return value of PictureTaken
	 */
	public final java.lang.Boolean getPictureTaken()
	{
		return getPictureTaken(getContext());
	}

	/**
	 * @param context
	 * @return value of PictureTaken
	 */
	public final java.lang.Boolean getPictureTaken(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Boolean) getMendixObject().getValue(context, MemberNames.PictureTaken.toString());
	}

	/**
	 * Set value of PictureTaken
	 * @param picturetaken
	 */
	public final void setPictureTaken(java.lang.Boolean picturetaken)
	{
		setPictureTaken(getContext(), picturetaken);
	}

	/**
	 * Set value of PictureTaken
	 * @param context
	 * @param picturetaken
	 */
	public final void setPictureTaken(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Boolean picturetaken)
	{
		getMendixObject().setValue(context, MemberNames.PictureTaken.toString(), picturetaken);
	}

	/**
	 * @return value of URI
	 */
	public final java.lang.String getURI()
	{
		return getURI(getContext());
	}

	/**
	 * @param context
	 * @return value of URI
	 */
	public final java.lang.String getURI(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.URI.toString());
	}

	/**
	 * Set value of URI
	 * @param uri
	 */
	public final void setURI(java.lang.String uri)
	{
		setURI(getContext(), uri);
	}

	/**
	 * Set value of URI
	 * @param context
	 * @param uri
	 */
	public final void setURI(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String uri)
	{
		getMendixObject().setValue(context, MemberNames.URI.toString(), uri);
	}

	/**
	 * @return value of IsVertical
	 */
	public final java.lang.Boolean getIsVertical()
	{
		return getIsVertical(getContext());
	}

	/**
	 * @param context
	 * @return value of IsVertical
	 */
	public final java.lang.Boolean getIsVertical(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Boolean) getMendixObject().getValue(context, MemberNames.IsVertical.toString());
	}

	/**
	 * Set value of IsVertical
	 * @param isvertical
	 */
	public final void setIsVertical(java.lang.Boolean isvertical)
	{
		setIsVertical(getContext(), isvertical);
	}

	/**
	 * Set value of IsVertical
	 * @param context
	 * @param isvertical
	 */
	public final void setIsVertical(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Boolean isvertical)
	{
		getMendixObject().setValue(context, MemberNames.IsVertical.toString(), isvertical);
	}

	/**
	 * @return value of Width
	 */
	public final java.lang.Integer getWidth()
	{
		return getWidth(getContext());
	}

	/**
	 * @param context
	 * @return value of Width
	 */
	public final java.lang.Integer getWidth(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Integer) getMendixObject().getValue(context, MemberNames.Width.toString());
	}

	/**
	 * Set value of Width
	 * @param width
	 */
	public final void setWidth(java.lang.Integer width)
	{
		setWidth(getContext(), width);
	}

	/**
	 * Set value of Width
	 * @param context
	 * @param width
	 */
	public final void setWidth(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Integer width)
	{
		getMendixObject().setValue(context, MemberNames.Width.toString(), width);
	}

	/**
	 * @return value of Height
	 */
	public final java.lang.Integer getHeight()
	{
		return getHeight(getContext());
	}

	/**
	 * @param context
	 * @return value of Height
	 */
	public final java.lang.Integer getHeight(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Integer) getMendixObject().getValue(context, MemberNames.Height.toString());
	}

	/**
	 * Set value of Height
	 * @param height
	 */
	public final void setHeight(java.lang.Integer height)
	{
		setHeight(getContext(), height);
	}

	/**
	 * Set value of Height
	 * @param context
	 * @param height
	 */
	public final void setHeight(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Integer height)
	{
		getMendixObject().setValue(context, MemberNames.Height.toString(), height);
	}

	/**
	 * @return value of FileName
	 */
	public final java.lang.String getFileName()
	{
		return getFileName(getContext());
	}

	/**
	 * @param context
	 * @return value of FileName
	 */
	public final java.lang.String getFileName(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.FileName.toString());
	}

	/**
	 * Set value of FileName
	 * @param filename
	 */
	public final void setFileName(java.lang.String filename)
	{
		setFileName(getContext(), filename);
	}

	/**
	 * Set value of FileName
	 * @param context
	 * @param filename
	 */
	public final void setFileName(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String filename)
	{
		getMendixObject().setValue(context, MemberNames.FileName.toString(), filename);
	}

	/**
	 * @return value of FileSize
	 */
	public final java.lang.Integer getFileSize()
	{
		return getFileSize(getContext());
	}

	/**
	 * @param context
	 * @return value of FileSize
	 */
	public final java.lang.Integer getFileSize(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Integer) getMendixObject().getValue(context, MemberNames.FileSize.toString());
	}

	/**
	 * Set value of FileSize
	 * @param filesize
	 */
	public final void setFileSize(java.lang.Integer filesize)
	{
		setFileSize(getContext(), filesize);
	}

	/**
	 * Set value of FileSize
	 * @param context
	 * @param filesize
	 */
	public final void setFileSize(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Integer filesize)
	{
		getMendixObject().setValue(context, MemberNames.FileSize.toString(), filesize);
	}

	/**
	 * @return value of FileType
	 */
	public final java.lang.String getFileType()
	{
		return getFileType(getContext());
	}

	/**
	 * @param context
	 * @return value of FileType
	 */
	public final java.lang.String getFileType(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.FileType.toString());
	}

	/**
	 * Set value of FileType
	 * @param filetype
	 */
	public final void setFileType(java.lang.String filetype)
	{
		setFileType(getContext(), filetype);
	}

	/**
	 * Set value of FileType
	 * @param context
	 * @param filetype
	 */
	public final void setFileType(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String filetype)
	{
		getMendixObject().setValue(context, MemberNames.FileType.toString(), filetype);
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return imageMetaDataMendixObject;
	}

	/**
	 * @return the IContext instance of this proxy, or null if no IContext instance was specified at initialization.
	 */
	public final com.mendix.systemwideinterfaces.core.IContext getContext()
	{
		return context;
	}

	@java.lang.Override
	public boolean equals(Object obj)
	{
		if (obj == this) {
			return true;
		}
		if (obj != null && getClass().equals(obj.getClass()))
		{
			final nativemobileresources.proxies.ImageMetaData that = (nativemobileresources.proxies.ImageMetaData) obj;
			return getMendixObject().equals(that.getMendixObject());
		}
		return false;
	}

	@java.lang.Override
	public int hashCode()
	{
		return getMendixObject().hashCode();
	}

	/**
	 * @return String name of this class
	 */
	public static java.lang.String getType()
	{
		return entityName;
	}

	/**
	 * @return String GUID from this object, format: ID_0000000000
	 * @deprecated Use getMendixObject().getId().toLong() to get a unique identifier for this object.
	 */
	@java.lang.Deprecated
	public java.lang.String getGUID()
	{
		return "ID_" + getMendixObject().getId().toLong();
	}
}