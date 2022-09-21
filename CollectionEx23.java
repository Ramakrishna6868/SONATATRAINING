package javaindebuggingmode;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

 class Studentt {

	private Integer id;

		private String name;

	public Studentt(Integer id, String name)
	{

		this.id = id;
		this.name = name;
	}

	public Integer getId()
	{
		return id;
	}

	public String getName()
	{
		return name;
	}
}

public class CollectionEx23 {

	public static void main(String[] args)
	{

		List<Studentt>
			lt = new ArrayList<Studentt>();

		lt.add(new Studentt(1, "Geeks"));
		lt.add(new Studentt(2, "For"));
		lt.add(new Studentt(3, "Geeks"));

		Map<Integer, String> map = new HashMap<>();

		for (Studentt stu : lt) {
			map.put(stu.getId(), stu.getName());
		}

		System.out.println("Map : " + map);
	}
}

