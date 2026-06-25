.class public final synthetic LN8/H;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Ln9/a;


# instance fields
.field public final synthetic a:LN8/c;

.field public final synthetic b:Landroid/os/Bundle;


# direct methods
.method public synthetic constructor <init>(LN8/c;Landroid/os/Bundle;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LN8/H;->a:LN8/c;

    .line 5
    .line 6
    iput-object p2, p0, LN8/H;->b:Landroid/os/Bundle;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final a(Ln9/i;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, LN8/H;->a:LN8/c;

    .line 2
    .line 3
    iget-object v1, p0, LN8/H;->b:Landroid/os/Bundle;

    .line 4
    .line 5
    invoke-virtual {v0, v1, p1}, LN8/c;->f(Landroid/os/Bundle;Ln9/i;)Ln9/i;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    return-object p1
.end method
