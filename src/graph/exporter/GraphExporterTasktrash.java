package graph.exporter;
//package graph.exporter;
//
//import java.util.Collections;
//import java.util.LinkedHashMap;
//import java.util.Map;
//
//import org.eclipse.core.resources.IProject;
//import org.eclipse.core.resources.ResourcesPlugin;
//import org.eclipse.core.runtime.IProgressMonitor;
//import org.eclipse.swt.widgets.Shell;
//import org.preesm.commons.doc.annotations.Port;
//import org.preesm.commons.doc.annotations.PreesmTask;
//import org.preesm.model.pisdf.PiGraph;
//import org.preesm.model.scenario.Scenario;
//import org.preesm.ui.pisdf.util.SavePiGraph;
//import org.preesm.workflow.elements.Workflow;
//import org.preesm.workflow.implement.AbstractTaskImplementation;
//
///**
// * Clustering Task
// *
// * @author orenaud
// *
// */
//@PreesmTask(id = "graph.exporter.task.identifier", name = "Graph Exporter",
//    inputs = { @Port(name = "PiMM", type = PiGraph.class), @Port(name = "scenario", type = Scenario.class) }
//
//)
//public abstract class GraphExporterTask extends AbstractTaskImplementation {
//  @Override
//  public Map<String, Object> execute(Map<String, Object> inputs, Map<String, String> parameters,
//      IProgressMonitor monitor, String nodeName, Workflow workflow) {
//
//    // Task inputs
//    PiGraph inputGraph = (PiGraph) inputs.get("PiMM");
//    Scenario scenario = (Scenario) inputs.get("scenario");
//    IProject iProject = ResourcesPlugin.getWorkspace().getRoot().getProject();
//    SavePiGraph.save(iProject, inputGraph, "_wow");
//    return Collections.emptyMap();
//  }
//
//  @Override
//  public Map<String, String> getDefaultParameters() {
//    final Map<String, String> parameters = new LinkedHashMap<>();
//
//    return parameters;
//  }
//
//  @Override
//  public String monitorMessage() {
//    return "Starting Execution of graph exporter Task";
//  }
//
//  public abstract void processPiSDF(final PiGraph pigraph, final IProject iProject, final Shell shell);
//}
