.class public final synthetic Ly7/k;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Ly7/a;

.field public final synthetic b:Ly7/n;

.field public final synthetic c:Ly7/o;


# direct methods
.method public synthetic constructor <init>(Ly7/a;Ly7/n;Ly7/o;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ly7/k;->a:Ly7/a;

    .line 5
    .line 6
    iput-object p2, p0, Ly7/k;->b:Ly7/n;

    .line 7
    .line 8
    iput-object p3, p0, Ly7/k;->c:Ly7/o;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .line 1
    iget-object v0, p0, Ly7/k;->a:Ly7/a;

    .line 2
    .line 3
    iget-object v1, p0, Ly7/k;->b:Ly7/n;

    .line 4
    .line 5
    iget-object v2, p0, Ly7/k;->c:Ly7/o;

    .line 6
    .line 7
    invoke-static {v0, v1, v2}, Ly7/n$a;->e(Ly7/a;Ly7/n;Ly7/o;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method
