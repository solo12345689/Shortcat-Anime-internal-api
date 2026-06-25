.class final Lc9/u;
.super Lc9/i;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# instance fields
.field final synthetic a:Ln9/j;


# direct methods
.method constructor <init>(Lc9/b;Ln9/j;)V
    .locals 0

    .line 1
    iput-object p2, p0, Lc9/u;->a:Ln9/j;

    .line 2
    .line 3
    invoke-direct {p0}, Lc9/i;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final z1(Lcom/google/android/gms/common/api/Status;Z)V
    .locals 1

    .line 1
    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 2
    .line 3
    .line 4
    move-result-object p2

    .line 5
    iget-object v0, p0, Lc9/u;->a:Ln9/j;

    .line 6
    .line 7
    invoke-static {p1, p2, v0}, LQ8/s;->a(Lcom/google/android/gms/common/api/Status;Ljava/lang/Object;Ln9/j;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method
