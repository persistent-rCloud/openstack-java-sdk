package org.openstack.model.compute.nova.volume;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import org.openstack.model.compute.Volume;
import org.openstack.model.compute.VolumeList;

@XmlRootElement(name="volumes", namespace="")
@XmlAccessorType(XmlAccessType.NONE)
public class NovaVolumeList implements Serializable, VolumeList {

	@XmlElement(name="volume")
	private List<NovaVolume> list = new ArrayList<NovaVolume>();

	/* (non-Javadoc)
	 * @see org.openstack.model.compute.VolumeList#getList()
	 */
	@Override
	public List<Volume> getList() {
		return (List<Volume>) (List<?>) list;
	}

	public void setList(List<NovaVolume> list) {
		this.list = list;
	}

	@Override
	public String toString() {
		return "NovaVolumeList [list=" + list + "]";
	}
	
}