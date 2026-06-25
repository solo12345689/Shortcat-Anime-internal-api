.class public final Lcom/facebook/react/runtime/ReactInstance$c;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/facebook/react/runtime/ReactInstance;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "c"
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/facebook/react/runtime/ReactInstance$c;-><init>()V

    return-void
.end method

.method public static final synthetic a(Lcom/facebook/react/runtime/ReactInstance$c;Ljava/util/List;Ljava/util/Map;)Ljava/util/Map;
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lcom/facebook/react/runtime/ReactInstance$c;->c(Ljava/util/List;Ljava/util/Map;)Ljava/util/Map;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic b(Lcom/facebook/react/runtime/ReactInstance$c;Lcom/facebook/react/uimanager/ViewManager;Ljava/util/Map;)Lcom/facebook/react/bridge/NativeMap;
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lcom/facebook/react/runtime/ReactInstance$c;->d(Lcom/facebook/react/uimanager/ViewManager;Ljava/util/Map;)Lcom/facebook/react/bridge/NativeMap;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private final c(Ljava/util/List;Ljava/util/Map;)Ljava/util/Map;
    .locals 5

    .line 1
    sget-object v0, Lcom/facebook/react/bridge/ReactMarkerConstants;->CREATE_UI_MANAGER_MODULE_CONSTANTS_START:Lcom/facebook/react/bridge/ReactMarkerConstants;

    .line 2
    .line 3
    invoke-static {v0}, Lcom/facebook/react/bridge/ReactMarker;->logMarker(Lcom/facebook/react/bridge/ReactMarkerConstants;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "CreateUIManagerConstants"

    .line 7
    .line 8
    const-wide/16 v1, 0x0

    .line 9
    .line 10
    invoke-static {v1, v2, v0}, LU7/b;->a(JLjava/lang/String;)LU7/b$a;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    const-string v3, "Lazy"

    .line 15
    .line 16
    sget-object v4, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 17
    .line 18
    invoke-virtual {v0, v3, v4}, LU7/b$a;->b(Ljava/lang/String;Ljava/lang/Object;)LU7/b$a;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    invoke-virtual {v0}, LU7/b$a;->c()V

    .line 23
    .line 24
    .line 25
    const/4 v0, 0x0

    .line 26
    :try_start_0
    invoke-static {p1, v0, p2}, Lcom/facebook/react/uimanager/i0;->c(Ljava/util/List;Ljava/util/Map;Ljava/util/Map;)Ljava/util/Map;

    .line 27
    .line 28
    .line 29
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 30
    invoke-static {v1, v2}, LU7/a;->i(J)V

    .line 31
    .line 32
    .line 33
    sget-object p2, Lcom/facebook/react/bridge/ReactMarkerConstants;->CREATE_UI_MANAGER_MODULE_CONSTANTS_END:Lcom/facebook/react/bridge/ReactMarkerConstants;

    .line 34
    .line 35
    invoke-static {p2}, Lcom/facebook/react/bridge/ReactMarker;->logMarker(Lcom/facebook/react/bridge/ReactMarkerConstants;)V

    .line 36
    .line 37
    .line 38
    return-object p1

    .line 39
    :catchall_0
    move-exception p1

    .line 40
    invoke-static {v1, v2}, LU7/a;->i(J)V

    .line 41
    .line 42
    .line 43
    sget-object p2, Lcom/facebook/react/bridge/ReactMarkerConstants;->CREATE_UI_MANAGER_MODULE_CONSTANTS_END:Lcom/facebook/react/bridge/ReactMarkerConstants;

    .line 44
    .line 45
    invoke-static {p2}, Lcom/facebook/react/bridge/ReactMarker;->logMarker(Lcom/facebook/react/bridge/ReactMarkerConstants;)V

    .line 46
    .line 47
    .line 48
    throw p1
.end method

.method private final d(Lcom/facebook/react/uimanager/ViewManager;Ljava/util/Map;)Lcom/facebook/react/bridge/NativeMap;
    .locals 5

    .line 1
    const-string v0, "ReactInstance.getConstantsForViewManager"

    .line 2
    .line 3
    const-wide/16 v1, 0x0

    .line 4
    .line 5
    invoke-static {v1, v2, v0}, LU7/b;->a(JLjava/lang/String;)LU7/b$a;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {p1}, Lcom/facebook/react/uimanager/ViewManager;->getName()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v3

    .line 13
    const-string v4, "getName(...)"

    .line 14
    .line 15
    invoke-static {v3, v4}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    const-string v4, "ViewManager"

    .line 19
    .line 20
    invoke-virtual {v0, v4, v3}, LU7/b$a;->b(Ljava/lang/String;Ljava/lang/Object;)LU7/b$a;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    const-string v3, "Lazy"

    .line 25
    .line 26
    sget-object v4, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 27
    .line 28
    invoke-virtual {v0, v3, v4}, LU7/b$a;->b(Ljava/lang/String;Ljava/lang/Object;)LU7/b$a;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    invoke-virtual {v0}, LU7/b$a;->c()V

    .line 33
    .line 34
    .line 35
    const/4 v0, 0x0

    .line 36
    :try_start_0
    invoke-static {p1, v0, v0, v0, p2}, Lcom/facebook/react/uimanager/i0;->d(Lcom/facebook/react/uimanager/ViewManager;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;)Ljava/util/Map;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    invoke-static {p1}, Lcom/facebook/react/bridge/Arguments;->makeNativeMap(Ljava/util/Map;)Lcom/facebook/react/bridge/WritableNativeMap;

    .line 41
    .line 42
    .line 43
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 44
    invoke-static {v1, v2}, LU7/b;->b(J)LU7/b$a;

    .line 45
    .line 46
    .line 47
    move-result-object p2

    .line 48
    invoke-virtual {p2}, LU7/b$a;->c()V

    .line 49
    .line 50
    .line 51
    return-object p1

    .line 52
    :catchall_0
    move-exception p1

    .line 53
    invoke-static {v1, v2}, LU7/b;->b(J)LU7/b$a;

    .line 54
    .line 55
    .line 56
    move-result-object p2

    .line 57
    invoke-virtual {p2}, LU7/b$a;->c()V

    .line 58
    .line 59
    .line 60
    throw p1
.end method
