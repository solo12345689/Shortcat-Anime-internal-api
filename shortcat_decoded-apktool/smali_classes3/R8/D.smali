.class final LR8/D;
.super LR8/E;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# instance fields
.field final synthetic a:Landroid/content/Intent;

.field final synthetic b:LQ8/i;


# direct methods
.method constructor <init>(Landroid/content/Intent;LQ8/i;I)V
    .locals 0

    .line 1
    iput-object p1, p0, LR8/D;->a:Landroid/content/Intent;

    .line 2
    .line 3
    iput-object p2, p0, LR8/D;->b:LQ8/i;

    .line 4
    .line 5
    invoke-direct {p0}, LR8/E;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 3

    .line 1
    iget-object v0, p0, LR8/D;->a:Landroid/content/Intent;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v1, p0, LR8/D;->b:LQ8/i;

    .line 6
    .line 7
    const/4 v2, 0x2

    .line 8
    invoke-interface {v1, v0, v2}, LQ8/i;->startActivityForResult(Landroid/content/Intent;I)V

    .line 9
    .line 10
    .line 11
    :cond_0
    return-void
.end method
