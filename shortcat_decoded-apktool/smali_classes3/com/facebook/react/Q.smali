.class public final synthetic Lcom/facebook/react/Q;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lcom/facebook/react/T$b;


# instance fields
.field public final synthetic a:Lcom/facebook/react/O;

.field public final synthetic b:Lcom/facebook/react/bridge/ReactApplicationContext;


# direct methods
.method public synthetic constructor <init>(Lcom/facebook/react/O;Lcom/facebook/react/bridge/ReactApplicationContext;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/facebook/react/Q;->a:Lcom/facebook/react/O;

    .line 5
    .line 6
    iput-object p2, p0, Lcom/facebook/react/Q;->b:Lcom/facebook/react/bridge/ReactApplicationContext;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final getModule(Ljava/lang/String;)Lcom/facebook/react/bridge/NativeModule;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/facebook/react/Q;->a:Lcom/facebook/react/O;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/facebook/react/Q;->b:Lcom/facebook/react/bridge/ReactApplicationContext;

    .line 4
    .line 5
    invoke-static {v0, v1, p1}, Lcom/facebook/react/T;->b(Lcom/facebook/react/O;Lcom/facebook/react/bridge/ReactApplicationContext;Ljava/lang/String;)Lcom/facebook/react/bridge/NativeModule;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    return-object p1
.end method
