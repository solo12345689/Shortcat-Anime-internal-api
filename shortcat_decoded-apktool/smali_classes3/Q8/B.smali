.class final LQ8/B;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:I

.field final synthetic b:LQ8/E;


# direct methods
.method constructor <init>(LQ8/E;I)V
    .locals 0

    .line 1
    iput-object p1, p0, LQ8/B;->b:LQ8/E;

    .line 2
    .line 3
    iput p2, p0, LQ8/B;->a:I

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
    iget-object v0, p0, LQ8/B;->b:LQ8/E;

    .line 2
    .line 3
    iget v1, p0, LQ8/B;->a:I

    .line 4
    .line 5
    invoke-static {v0, v1}, LQ8/E;->A(LQ8/E;I)V

    .line 6
    .line 7
    .line 8
    return-void
.end method
