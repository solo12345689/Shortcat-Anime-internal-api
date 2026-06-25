.class final LQ8/u;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Ln9/d;


# instance fields
.field final synthetic a:Ln9/j;

.field final synthetic b:LQ8/v;


# direct methods
.method constructor <init>(LQ8/v;Ln9/j;)V
    .locals 0

    .line 1
    iput-object p1, p0, LQ8/u;->b:LQ8/v;

    .line 2
    .line 3
    iput-object p2, p0, LQ8/u;->a:Ln9/j;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final a(Ln9/i;)V
    .locals 1

    .line 1
    iget-object p1, p0, LQ8/u;->b:LQ8/v;

    .line 2
    .line 3
    invoke-static {p1}, LQ8/v;->b(LQ8/v;)Ljava/util/Map;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    iget-object v0, p0, LQ8/u;->a:Ln9/j;

    .line 8
    .line 9
    invoke-interface {p1, v0}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    return-void
.end method
