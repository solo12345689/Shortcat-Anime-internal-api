.class public final synthetic LP2/k;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements LP2/n$i$a;


# instance fields
.field public final synthetic a:LP2/n$e;

.field public final synthetic b:Ljava/lang/String;

.field public final synthetic c:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(LP2/n$e;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LP2/k;->a:LP2/n$e;

    .line 5
    .line 6
    iput-object p2, p0, LP2/k;->b:Ljava/lang/String;

    .line 7
    .line 8
    iput-object p3, p0, LP2/k;->c:Ljava/lang/String;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final a(ILq2/a0;[I)Ljava/util/List;
    .locals 6

    .line 1
    iget-object v0, p0, LP2/k;->a:LP2/n$e;

    .line 2
    .line 3
    iget-object v1, p0, LP2/k;->b:Ljava/lang/String;

    .line 4
    .line 5
    iget-object v2, p0, LP2/k;->c:Ljava/lang/String;

    .line 6
    .line 7
    move v3, p1

    .line 8
    move-object v4, p2

    .line 9
    move-object v5, p3

    .line 10
    invoke-static/range {v0 .. v5}, LP2/n;->w(LP2/n$e;Ljava/lang/String;Ljava/lang/String;ILq2/a0;[I)Ljava/util/List;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    return-object p1
.end method
