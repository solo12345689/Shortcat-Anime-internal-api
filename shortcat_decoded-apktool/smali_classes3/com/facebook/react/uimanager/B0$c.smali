.class Lcom/facebook/react/uimanager/B0$c;
.super Lcom/facebook/react/uimanager/B0$m;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/facebook/react/uimanager/B0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "c"
.end annotation


# instance fields
.field private final i:Z


# direct methods
.method public constructor <init>(LB7/a;Ljava/lang/reflect/Method;Z)V
    .locals 2

    .line 1
    const-string v0, "boolean"

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {p0, p1, v0, p2, v1}, Lcom/facebook/react/uimanager/B0$m;-><init>(LB7/a;Ljava/lang/String;Ljava/lang/reflect/Method;Lcom/facebook/react/uimanager/C0;)V

    .line 5
    .line 6
    .line 7
    iput-boolean p3, p0, Lcom/facebook/react/uimanager/B0$c;->i:Z

    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method protected c(Ljava/lang/Object;Landroid/content/Context;)Ljava/lang/Object;
    .locals 0

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    iget-boolean p1, p0, Lcom/facebook/react/uimanager/B0$c;->i:Z

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    check-cast p1, Ljava/lang/Boolean;

    .line 7
    .line 8
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 9
    .line 10
    .line 11
    move-result p1

    .line 12
    :goto_0
    if-eqz p1, :cond_1

    .line 13
    .line 14
    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 15
    .line 16
    return-object p1

    .line 17
    :cond_1
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 18
    .line 19
    return-object p1
.end method
