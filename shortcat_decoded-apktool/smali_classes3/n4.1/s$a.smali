.class Ln4/s$a;
.super LM3/i;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ln4/s;-><init>(LM3/q;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic d:Ln4/s;


# direct methods
.method constructor <init>(Ln4/s;LM3/q;)V
    .locals 0

    .line 1
    iput-object p1, p0, Ln4/s$a;->d:Ln4/s;

    .line 2
    .line 3
    invoke-direct {p0, p2}, LM3/i;-><init>(LM3/q;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public e()Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "INSERT OR REPLACE INTO `WorkProgress` (`work_spec_id`,`progress`) VALUES (?,?)"

    .line 2
    .line 3
    return-object v0
.end method

.method public bridge synthetic i(LS3/k;Ljava/lang/Object;)V
    .locals 0

    .line 1
    invoke-static {p2}, Landroid/support/v4/media/session/b;->a(Ljava/lang/Object;)V

    .line 2
    .line 3
    .line 4
    const/4 p2, 0x0

    .line 5
    invoke-virtual {p0, p1, p2}, Ln4/s$a;->l(LS3/k;Ln4/q;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public l(LS3/k;Ln4/q;)V
    .locals 0

    .line 1
    const/4 p1, 0x0

    .line 2
    throw p1
.end method
