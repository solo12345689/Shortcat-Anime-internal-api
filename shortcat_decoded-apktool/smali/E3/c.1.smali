.class public final synthetic LE3/c;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements LE3/g$a;


# instance fields
.field public final synthetic a:LE3/g;

.field public final synthetic b:LE3/h3$g;

.field public final synthetic c:Lq2/P$b;


# direct methods
.method public synthetic constructor <init>(LE3/g;LE3/h3$g;Lq2/P$b;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LE3/c;->a:LE3/g;

    .line 5
    .line 6
    iput-object p2, p0, LE3/c;->b:LE3/h3$g;

    .line 7
    .line 8
    iput-object p3, p0, LE3/c;->c:Lq2/P$b;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final run()Lcom/google/common/util/concurrent/p;
    .locals 3

    .line 1
    iget-object v0, p0, LE3/c;->a:LE3/g;

    .line 2
    .line 3
    iget-object v1, p0, LE3/c;->b:LE3/h3$g;

    .line 4
    .line 5
    iget-object v2, p0, LE3/c;->c:Lq2/P$b;

    .line 6
    .line 7
    invoke-static {v0, v1, v2}, LE3/g;->c(LE3/g;LE3/h3$g;Lq2/P$b;)Lcom/google/common/util/concurrent/p;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    return-object v0
.end method
