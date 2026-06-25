.class public final Lcom/facebook/hermes/reactexecutor/HermesExecutor;
.super Lcom/facebook/react/bridge/JavaScriptExecutor;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/facebook/hermes/reactexecutor/HermesExecutor$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0007\u0018\u0000 \n2\u00020\u0001:\u0001\nB\u0019\u0008\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u000f\u0010\u0008\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\u0008\u0008\u0010\t\u00a8\u0006\u000b"
    }
    d2 = {
        "Lcom/facebook/hermes/reactexecutor/HermesExecutor;",
        "Lcom/facebook/react/bridge/JavaScriptExecutor;",
        "",
        "enableDebugger",
        "",
        "debuggerName",
        "<init>",
        "(ZLjava/lang/String;)V",
        "getName",
        "()Ljava/lang/String;",
        "a",
        "ReactAndroid_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final a:Lcom/facebook/hermes/reactexecutor/HermesExecutor$a;

.field private static b:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lcom/facebook/hermes/reactexecutor/HermesExecutor$a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lcom/facebook/hermes/reactexecutor/HermesExecutor$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lcom/facebook/hermes/reactexecutor/HermesExecutor;->a:Lcom/facebook/hermes/reactexecutor/HermesExecutor$a;

    .line 8
    .line 9
    invoke-virtual {v0}, Lcom/facebook/hermes/reactexecutor/HermesExecutor$a;->b()V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public constructor <init>(ZLjava/lang/String;)V
    .locals 1

    .line 1
    const-string v0, "debuggerName"

    .line 2
    .line 3
    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    sget-object v0, Lcom/facebook/hermes/reactexecutor/HermesExecutor;->a:Lcom/facebook/hermes/reactexecutor/HermesExecutor$a;

    .line 7
    .line 8
    invoke-static {v0, p1, p2}, Lcom/facebook/hermes/reactexecutor/HermesExecutor$a;->a(Lcom/facebook/hermes/reactexecutor/HermesExecutor$a;ZLjava/lang/String;)Lcom/facebook/jni/HybridData;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    invoke-direct {p0, p1}, Lcom/facebook/react/bridge/JavaScriptExecutor;-><init>(Lcom/facebook/jni/HybridData;)V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public static final synthetic a()Ljava/lang/String;
    .locals 1

    .line 1
    sget-object v0, Lcom/facebook/hermes/reactexecutor/HermesExecutor;->b:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public static final synthetic b(ZLjava/lang/String;J)Lcom/facebook/jni/HybridData;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3}, Lcom/facebook/hermes/reactexecutor/HermesExecutor;->initHybrid(ZLjava/lang/String;J)Lcom/facebook/jni/HybridData;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic c(ZLjava/lang/String;)Lcom/facebook/jni/HybridData;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/facebook/hermes/reactexecutor/HermesExecutor;->initHybridDefaultConfig(ZLjava/lang/String;)Lcom/facebook/jni/HybridData;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic d(Ljava/lang/String;)V
    .locals 0

    .line 1
    sput-object p0, Lcom/facebook/hermes/reactexecutor/HermesExecutor;->b:Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method

.method private static final native initHybrid(ZLjava/lang/String;J)Lcom/facebook/jni/HybridData;
.end method

.method private static final native initHybridDefaultConfig(ZLjava/lang/String;)Lcom/facebook/jni/HybridData;
.end method


# virtual methods
.method public getName()Ljava/lang/String;
    .locals 3

    .line 1
    sget-object v0, Lcom/facebook/hermes/reactexecutor/HermesExecutor;->b:Ljava/lang/String;

    .line 2
    .line 3
    new-instance v1, Ljava/lang/StringBuilder;

    .line 4
    .line 5
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 6
    .line 7
    .line 8
    const-string v2, "HermesExecutor"

    .line 9
    .line 10
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 14
    .line 15
    .line 16
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    return-object v0
.end method
