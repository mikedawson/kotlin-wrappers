// Automatically generated - do not modify!

package typescript

import js.core.ReadonlyArray

sealed external interface IncrementalProgramOptions<T : BuilderProgram> {
    var rootNames: ReadonlyArray<String>
    var options: CompilerOptions
    var configFileParsingDiagnostics: ReadonlyArray<Diagnostic>?
    var projectReferences: ReadonlyArray<ProjectReference>?
    var host: CompilerHost?
    var createProgram: CreateProgram<T>?
}
