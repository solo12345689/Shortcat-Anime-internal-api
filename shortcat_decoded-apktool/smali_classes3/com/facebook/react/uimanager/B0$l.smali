.class Lcom/facebook/react/uimanager/B0$l;
.super Lcom/facebook/react/uimanager/B0$m;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/facebook/react/uimanager/B0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "l"
.end annotation


# direct methods
.method public constructor <init>(LB7/a;Ljava/lang/reflect/Method;)V
    .locals 2

    .line 1
    const-string v0, "Map"

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {p0, p1, v0, p2, v1}, Lcom/facebook/react/uimanager/B0$m;-><init>(LB7/a;Ljava/lang/String;Ljava/lang/reflect/Method;Lcom/facebook/react/uimanager/C0;)V

    .line 5
    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method protected c(Ljava/lang/Object;Landroid/content/Context;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lcom/facebook/react/bridge/ReadableMap;

    .line 2
    .line 3
    return-object p1
.end method
