package fa.training.demoSpringBoot.model;

public class Project {
	private int project_id;
	private String project_name;
	private int dept_id;

	public Project() {
		super();
	}

	public Project(int project_id, String project_name, int dept_id) {
		super();
		this.project_id = project_id;
		this.project_name = project_name;
		this.dept_id = dept_id;
	}

	public int getProject_id() {
		return project_id;
	}

	public void setProject_id(int project_id) {
		this.project_id = project_id;
	}

	public String getProject_name() {
		return project_name;
	}

	public void setProject_name(String project_name) {
		this.project_name = project_name;
	}

	public int getDept_id() {
		return dept_id;
	}

	public void setDept_id(int dept_id) {
		this.dept_id = dept_id;
	}

	@Override
	public String toString() {
		return "Project [project_id=" + project_id + ", project_name=" + project_name + ", dept_id=" + dept_id + "]";
	}

}
