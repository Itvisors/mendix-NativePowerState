// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package testpowerstate.proxies;

public class NativeAppContext implements com.mendix.systemwideinterfaces.core.IEntityProxy
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject nativeAppContextMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "TestPowerState.NativeAppContext";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		PowerStateLog("PowerStateLog");

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

	public NativeAppContext(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, entityName));
	}

	protected NativeAppContext(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject nativeAppContextMendixObject)
	{
		if (nativeAppContextMendixObject == null) {
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		}
		if (!nativeAppContextMendixObject.isInstanceOf(entityName)) {
			throw new java.lang.IllegalArgumentException(String.format("The given object is not a %s", entityName));
		}	

		this.nativeAppContextMendixObject = nativeAppContextMendixObject;
		this.context = context;
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 * @param context The context to be used
	 * @param mendixObject The Mendix object for the new instance
	 * @return a new instance of this proxy class
	 */
	public static testpowerstate.proxies.NativeAppContext initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new testpowerstate.proxies.NativeAppContext(context, mendixObject);
	}

	public static testpowerstate.proxies.NativeAppContext load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return testpowerstate.proxies.NativeAppContext.initialize(context, mendixObject);
	}

	/**
	 * @return value of PowerStateLog
	 */
	public final java.lang.String getPowerStateLog()
	{
		return getPowerStateLog(getContext());
	}

	/**
	 * @param context
	 * @return value of PowerStateLog
	 */
	public final java.lang.String getPowerStateLog(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.PowerStateLog.toString());
	}

	/**
	 * Set value of PowerStateLog
	 * @param powerstatelog
	 */
	public final void setPowerStateLog(java.lang.String powerstatelog)
	{
		setPowerStateLog(getContext(), powerstatelog);
	}

	/**
	 * Set value of PowerStateLog
	 * @param context
	 * @param powerstatelog
	 */
	public final void setPowerStateLog(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String powerstatelog)
	{
		getMendixObject().setValue(context, MemberNames.PowerStateLog.toString(), powerstatelog);
	}

	@java.lang.Override
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return nativeAppContextMendixObject;
	}

	@java.lang.Override
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
			final testpowerstate.proxies.NativeAppContext that = (testpowerstate.proxies.NativeAppContext) obj;
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
   * Gives full name ("Module.Entity" name) of the type of the entity.
   *
   * @return the name
   */
	public static java.lang.String getType()
	{
		return entityName;
	}
}
