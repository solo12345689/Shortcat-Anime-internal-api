.class final LK/z;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements LI0/B;


# instance fields
.field private final a:Lie/a;


# direct methods
.method public constructor <init>(Lie/a;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LK/z;->a:Lie/a;

    .line 5
    .line 6
    return-void
.end method

.method public static final synthetic a(LK/z;)Lie/a;
    .locals 0

    .line 1
    iget-object p0, p0, LK/z;->a:Lie/a;

    .line 2
    .line 3
    return-object p0
.end method


# virtual methods
.method public measure-3p2s80s(Landroidx/compose/ui/layout/l;Ljava/util/List;J)LI0/C;
    .locals 7

    .line 1
    invoke-static {p3, p4}, Li1/b;->l(J)I

    .line 2
    .line 3
    .line 4
    move-result v1

    .line 5
    invoke-static {p3, p4}, Li1/b;->k(J)I

    .line 6
    .line 7
    .line 8
    move-result v2

    .line 9
    new-instance v4, LK/z$a;

    .line 10
    .line 11
    invoke-direct {v4, p2, p0}, LK/z$a;-><init>(Ljava/util/List;LK/z;)V

    .line 12
    .line 13
    .line 14
    const/4 v5, 0x4

    .line 15
    const/4 v6, 0x0

    .line 16
    const/4 v3, 0x0

    .line 17
    move-object v0, p1

    .line 18
    invoke-static/range {v0 .. v6}, Landroidx/compose/ui/layout/l;->u0(Landroidx/compose/ui/layout/l;IILjava/util/Map;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)LI0/C;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    return-object p1
.end method
