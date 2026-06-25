.class public final Lcom/facebook/react/devsupport/v$d;
.super Landroid/os/AsyncTask;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/facebook/react/devsupport/v;->i()V
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
    iput-object p1, p0, Lcom/facebook/react/devsupport/v$d;->a:Lcom/facebook/react/devsupport/v;

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
    .locals 1

    .line 1
    const-string v0, "params"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, Lcom/facebook/react/devsupport/v$d;->a:Lcom/facebook/react/devsupport/v;

    .line 7
    .line 8
    invoke-static {p1}, Lcom/facebook/react/devsupport/v;->c(Lcom/facebook/react/devsupport/v;)Lcom/facebook/react/devsupport/f0;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    if-eqz p1, :cond_0

    .line 13
    .line 14
    invoke-interface {p1}, Lcom/facebook/react/devsupport/f0;->closeQuietly()V

    .line 15
    .line 16
    .line 17
    :cond_0
    iget-object p1, p0, Lcom/facebook/react/devsupport/v$d;->a:Lcom/facebook/react/devsupport/v;

    .line 18
    .line 19
    const/4 v0, 0x0

    .line 20
    invoke-static {p1, v0}, Lcom/facebook/react/devsupport/v;->g(Lcom/facebook/react/devsupport/v;Lcom/facebook/react/devsupport/f0;)V

    .line 21
    .line 22
    .line 23
    return-object v0
.end method

.method public bridge synthetic doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, [Ljava/lang/Void;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lcom/facebook/react/devsupport/v$d;->a([Ljava/lang/Void;)Ljava/lang/Void;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method
