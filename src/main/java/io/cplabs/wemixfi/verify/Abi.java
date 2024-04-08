package io.cplabs.wemixfi.verify;

import java.util.List;

public class Abi {

    public enum AbiType {
        CONSTRUCTOR, FUNCTION, EVENT, ERROR
    }

    public static class Function {
        private String name;
        private boolean constant; // "constant" renamed for clarity
        private boolean payable;
        private List<FunctionInput> inputs;
        private List<FunctionOutput> outputs;


        public String getName() {
            return this.name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public boolean isConstant() {
            return this.constant;
        }

        public void setConstant(boolean constant) {
            this.constant = constant;
        }

        public boolean isPayable() {
            return this.payable;
        }

        public void setPayable(boolean payable) {
            this.payable = payable;
        }

        public List<FunctionInput> getInputs() {
            return this.inputs;
        }

        public void setInputs(List<FunctionInput> inputs) {
            this.inputs = inputs;
        }

        public List<FunctionOutput> getOutputs() {
            return this.outputs;
        }

        public void setOutputs(List<FunctionOutput> outputs) {
            this.outputs = outputs;
        }
    }

    public static class FunctionInput {
        private String type;
        private String name;

        public String getType() {
            return this.type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public String getName() {
            return this.name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

    public static class FunctionOutput {
        private String type;

        public String getType() {
            return this.type;
        }

        public void setType(String type) {
            this.type = type;
        }
    }

    public static class Event {
        private String name;
        private boolean anonymous;
        private List<EventParameter> inputs;

        public String getName() {
            return this.name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public boolean isAnonymous() {
            return this.anonymous;
        }

        public void setAnonymous(boolean anonymous) {
            this.anonymous = anonymous;
        }

        public List<EventParameter> getInputs() {
            return this.inputs;
        }

        public void setInputs(List<EventParameter> inputs) {
            this.inputs = inputs;
        }
    }

    public static class EventParameter {
        private String type;
        private String name;
        private boolean indexed;

        public String getType() {
            return this.type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public String getName() {
            return this.name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public boolean isIndexed() {
            return this.indexed;
        }

        public void setIndexed(boolean indexed) {
            this.indexed = indexed;
        }
    }

    public static class Error {
        private String name;
        private List<ErrorParameter> inputs;

        public String getName() {
            return this.name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public List<ErrorParameter> getInputs() {
            return this.inputs;
        }

        public void setInputs(List<ErrorParameter> inputs) {
            this.inputs = inputs;
        }
    }

    public static class ErrorParameter {
        private String type;
        private String name;

        public String getType() {
            return this.type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public String getName() {
            return this.name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

    public static class Tuple {
        private List<TupleComponent> components;

        public List<TupleComponent> getComponents() {
            return this.components;
        }

        public void setComponents(List<TupleComponent> components) {
            this.components = components;
        }
    }

    public static class TupleComponent {
        private String type;
        private String name;

        public String getType() {
            return this.type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public String getName() {
            return this.name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

    private AbiType type;

    // Additional fields depending on AbiType (e.g., constructorParams for CONSTRUCTOR)
    private String[] constructorParams; // For constructor arguments
    private Function function;  // For functions
    private Event event;        // For events
    private Error error;        // For errors

	public AbiType getType() {
		return this.type;
	}

	public void setType(AbiType type) {
		this.type = type;
	}

	public String[] getConstructorParams() {
		return this.constructorParams;
	}

	public void setConstructorParams(String[] constructorParams) {
		this.constructorParams = constructorParams;
	}

	public Function getFunction() {
		return this.function;
	}

	public void setFunction(Function function) {
		this.function = function;
	}

	public Event getEvent() {
		return this.event;
	}

	public void setEvent(Event event) {
		this.event = event;
	}

	public Error getError() {
		return this.error;
	}

	public void setError(Error error) {
		this.error = error;
	}
}
