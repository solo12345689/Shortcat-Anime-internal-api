.class public final synthetic LP2/i;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements LP2/n$i$a;


# instance fields
.field public final synthetic a:LP2/n;

.field public final synthetic b:LP2/n$e;

.field public final synthetic c:Z

.field public final synthetic d:[I


# direct methods
.method public synthetic constructor <init>(LP2/n;LP2/n$e;Z[I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LP2/i;->a:LP2/n;

    .line 5
    .line 6
    iput-object p2, p0, LP2/i;->b:LP2/n$e;

    .line 7
    .line 8
    iput-boolean p3, p0, LP2/i;->c:Z

    .line 9
    .line 10
    iput-object p4, p0, LP2/i;->d:[I

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final a(ILq2/a0;[I)Ljava/util/List;
    .locals 7

    .line 1
    iget-object v0, p0, LP2/i;->a:LP2/n;

    .line 2
    .line 3
    iget-object v1, p0, LP2/i;->b:LP2/n$e;

    .line 4
    .line 5
    iget-boolean v2, p0, LP2/i;->c:Z

    .line 6
    .line 7
    iget-object v3, p0, LP2/i;->d:[I

    .line 8
    .line 9
    move v4, p1

    .line 10
    move-object v5, p2

    .line 11
    move-object v6, p3

    .line 12
    invoke-static/range {v0 .. v6}, LP2/n;->r(LP2/n;LP2/n$e;Z[IILq2/a0;[I)Ljava/util/List;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    return-object p1
.end method
