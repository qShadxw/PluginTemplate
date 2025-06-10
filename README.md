# PluginTemplate
This is the current iteration of how I start off making spigot plugins as of recent.

## Features
- **Recursive Command & Listener Registering**\
The PluginManager class has functions to automatically go through all the classes within the commands and listeners package and register them all.

```java
// onLoad
PluginManager.setInstance(this);

// OnEnable
PluginManager.registerCommands();
PluginManager.registerListeners();
```

- **Organised Packages/Classes**\
To start off a project, organisation is a must to maintain such a healthy workflow. I tend to separate most things into packages whenever I feel like its different enough, such as Commands/Listeners and Managers.
`commands/` `enums/` `listeners/` `managers/` `objects/` `utils/`


- **Customised Logger**\
I've figured that the built-in logger for the spigot library just isn't as robust as I needed it. In many of my projects I needed to log many different things such as API calls or stuff to do with Configs/Databases, so I ended up creating my own Reason enums which fit right into the log function.
```java
ShadowLogger logger = new ShadowLogger();

logger.log(ShadowLogger.Reason.SQL, "Error communicating with the Database");
```

- **Custom Config Class**\
Similarly to the logger, the built-in config file objects just weren't cutting it for me. So I created my own which also allows the use of template/sample configs.
The code below creates a new file, under the name `config.yml` and uses the `sample_config.yml` from the resource folder of your IDE as a base.
The first boolean asks if you want to override the already existing file, if there is one.
The second boolean asks if you want to pre-load the file.
The last boolean asks if you're using a default config, `sample_config.yml`.
```java
ShadowConfig config = new ShadowConfig("sample_config.yml", false, true, true, "config.yml");
```

## Cloning
You are free to clone the project and use if you need.

### License
This project uses the GPL-2.0 License. [View the text for more details](https://github.com/qShadxw/PluginTemplate/tree/master?tab=GPL-2.0-1-ov-file#readme).