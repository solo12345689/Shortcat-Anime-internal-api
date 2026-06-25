.class public final Lcom/facebook/react/devsupport/v$g;
.super Landroid/os/AsyncTask;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/facebook/react/devsupport/v;->x()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/react/devsupport/v;


# direct methods
.method constructor <init>(Lcom/facebook/react/devsupport/v;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/facebook/react/devsupport/v$g;->a:Lcom/facebook/react/devsupport/v;

    .line 2
    .line 3
    invoke-direct {p0}, Landroid/os/AsyncTask;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method protected varargs a([Ljava/lang/Void;)Ljava/lang/Void;
    .locals 5

    .line 1
    const-string v0, "params"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, Lcom/facebook/react/devsupport/v$g;->a:Lcom/facebook/react/devsupport/v;

    .line 7
    .line 8
    invoke-static {p1}, Lcom/facebook/react/devsupport/v;->a(Lcom/facebook/react/devsupport/v;)Landroid/content/Context;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    invoke-static {p1}, Lcom/facebook/react/modules/systeminfo/a;->f(Landroid/content/Context;)Ljava/util/Map;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    const-string v0, "deviceName"

    .line 17
    .line 18
    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    check-cast p1, Ljava/lang/String;

    .line 23
    .line 24
    const/4 v0, 0x0

    .line 25
    if-nez p1, :cond_0

    .line 26
    .line 27
    const-string p1, "ReactNative"

    .line 28
    .line 29
    const-string v1, "Could not get device name from Inspector Host Metadata."

    .line 30
    .line 31
    invoke-static {p1, v1}, Lz5/a;->I(Ljava/lang/String;Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    return-object v0

    .line 35
    :cond_0
    iget-object v1, p0, Lcom/facebook/react/devsupport/v$g;->a:Lcom/facebook/react/devsupport/v;

    .line 36
    .line 37
    new-instance v2, Lcom/facebook/react/devsupport/CxxInspectorPackagerConnection;

    .line 38
    .line 39
    iget-object v3, p0, Lcom/facebook/react/devsupport/v$g;->a:Lcom/facebook/react/devsupport/v;

    .line 40
    .line 41
    invoke-static {v3}, Lcom/facebook/react/devsupport/v;->b(Lcom/facebook/react/devsupport/v;)Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v3

    .line 45
    iget-object v4, p0, Lcom/facebook/react/devsupport/v$g;->a:Lcom/facebook/react/devsupport/v;

    .line 46
    .line 47
    invoke-static {v4}, Lcom/facebook/react/devsupport/v;->d(Lcom/facebook/react/devsupport/v;)Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v4

    .line 51
    invoke-direct {v2, v3, p1, v4}, Lcom/facebook/react/devsupport/CxxInspectorPackagerConnection;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    invoke-virtual {v2}, Lcom/facebook/react/devsupport/CxxInspectorPackagerConnection;->connect()V

    .line 55
    .line 56
    .line 57
    invoke-static {v1, v2}, Lcom/facebook/react/devsupport/v;->g(Lcom/facebook/react/devsupport/v;Lcom/facebook/react/devsupport/f0;)V

    .line 58
    .line 59
    .line 60
    return-object v0
.end method

.method public bridge synthetic doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, [Ljava/lang/Void;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lcom/facebook/react/devsupport/v$g;->a([Ljava/lang/Void;)Ljava/lang/Void;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method
