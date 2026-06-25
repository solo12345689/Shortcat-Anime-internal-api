.class final LQ8/T;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Ll9/l;

.field final synthetic b:LQ8/V;


# direct methods
.method constructor <init>(LQ8/V;Ll9/l;)V
    .locals 0

    .line 1
    iput-object p1, p0, LQ8/T;->b:LQ8/V;

    .line 2
    .line 3
    iput-object p2, p0, LQ8/T;->a:Ll9/l;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 1
    iget-object v0, p0, LQ8/T;->b:LQ8/V;

    .line 2
    .line 3
    iget-object v1, p0, LQ8/T;->a:Ll9/l;

    .line 4
    .line 5
    invoke-static {v0, v1}, LQ8/V;->I3(LQ8/V;Ll9/l;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method
