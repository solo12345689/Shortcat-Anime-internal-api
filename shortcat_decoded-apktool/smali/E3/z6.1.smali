.class public final synthetic LE3/z6;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements LE3/g$a;


# instance fields
.field public final synthetic a:LE3/I6$e;

.field public final synthetic b:LE3/I3;

.field public final synthetic c:LE3/h3$g;

.field public final synthetic d:I


# direct methods
.method public synthetic constructor <init>(LE3/I6$e;LE3/I3;LE3/h3$g;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LE3/z6;->a:LE3/I6$e;

    .line 5
    .line 6
    iput-object p2, p0, LE3/z6;->b:LE3/I3;

    .line 7
    .line 8
    iput-object p3, p0, LE3/z6;->c:LE3/h3$g;

    .line 9
    .line 10
    iput p4, p0, LE3/z6;->d:I

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final run()Lcom/google/common/util/concurrent/p;
    .locals 4

    .line 1
    iget-object v0, p0, LE3/z6;->a:LE3/I6$e;

    .line 2
    .line 3
    iget-object v1, p0, LE3/z6;->b:LE3/I3;

    .line 4
    .line 5
    iget-object v2, p0, LE3/z6;->c:LE3/h3$g;

    .line 6
    .line 7
    iget v3, p0, LE3/z6;->d:I

    .line 8
    .line 9
    invoke-static {v0, v1, v2, v3}, LE3/I6;->i4(LE3/I6$e;LE3/I3;LE3/h3$g;I)Lcom/google/common/util/concurrent/p;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    return-object v0
.end method
