.class public LBe/V;
.super LBe/X;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lye/t0;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LBe/V$a;,
        LBe/V$b;
    }
.end annotation


# static fields
.field public static final l:LBe/V$a;


# instance fields
.field private final f:I

.field private final g:Z

.field private final h:Z

.field private final i:Z

.field private final j:Lqf/S;

.field private final k:Lye/t0;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, LBe/V$a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, LBe/V$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, LBe/V;->l:LBe/V$a;

    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>(Lye/a;Lye/t0;ILze/h;LXe/f;Lqf/S;ZZZLqf/S;Lye/h0;)V
    .locals 6

    .line 1
    const-string v0, "containingDeclaration"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "annotations"

    .line 7
    .line 8
    invoke-static {p4, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "name"

    .line 12
    .line 13
    invoke-static {p5, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const-string v0, "outType"

    .line 17
    .line 18
    invoke-static {p6, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    const-string v0, "source"

    .line 22
    .line 23
    move-object/from16 v5, p11

    .line 24
    .line 25
    invoke-static {v5, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    move-object v0, p0

    .line 29
    move-object v1, p1

    .line 30
    move-object v2, p4

    .line 31
    move-object v3, p5

    .line 32
    move-object v4, p6

    .line 33
    invoke-direct/range {v0 .. v5}, LBe/X;-><init>(Lye/m;Lze/h;LXe/f;Lqf/S;Lye/h0;)V

    .line 34
    .line 35
    .line 36
    iput p3, p0, LBe/V;->f:I

    .line 37
    .line 38
    iput-boolean p7, p0, LBe/V;->g:Z

    .line 39
    .line 40
    iput-boolean p8, p0, LBe/V;->h:Z

    .line 41
    .line 42
    iput-boolean p9, p0, LBe/V;->i:Z

    .line 43
    .line 44
    move-object/from16 v1, p10

    .line 45
    .line 46
    iput-object v1, p0, LBe/V;->j:Lqf/S;

    .line 47
    .line 48
    if-nez p2, :cond_0

    .line 49
    .line 50
    move-object v1, p0

    .line 51
    goto :goto_0

    .line 52
    :cond_0
    move-object v1, p2

    .line 53
    :goto_0
    iput-object v1, p0, LBe/V;->k:Lye/t0;

    .line 54
    .line 55
    return-void
.end method

.method public static final K0(Lye/a;Lye/t0;ILze/h;LXe/f;Lqf/S;ZZZLqf/S;Lye/h0;Lie/a;)LBe/V;
    .locals 13

    .line 1
    sget-object v0, LBe/V;->l:LBe/V$a;

    .line 2
    .line 3
    move-object v1, p0

    .line 4
    move-object v2, p1

    .line 5
    move v3, p2

    .line 6
    move-object/from16 v4, p3

    .line 7
    .line 8
    move-object/from16 v5, p4

    .line 9
    .line 10
    move-object/from16 v6, p5

    .line 11
    .line 12
    move/from16 v7, p6

    .line 13
    .line 14
    move/from16 v8, p7

    .line 15
    .line 16
    move/from16 v9, p8

    .line 17
    .line 18
    move-object/from16 v10, p9

    .line 19
    .line 20
    move-object/from16 v11, p10

    .line 21
    .line 22
    move-object/from16 v12, p11

    .line 23
    .line 24
    invoke-virtual/range {v0 .. v12}, LBe/V$a;->a(Lye/a;Lye/t0;ILze/h;LXe/f;Lqf/S;ZZZLqf/S;Lye/h0;Lie/a;)LBe/V;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    return-object p0
.end method


# virtual methods
.method public B0()Z
    .locals 2

    .line 1
    iget-boolean v0, p0, LBe/V;->g:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, LBe/V;->b()Lye/a;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    const-string v1, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.CallableMemberDescriptor"

    .line 10
    .line 11
    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    check-cast v0, Lye/b;

    .line 15
    .line 16
    invoke-interface {v0}, Lye/b;->h()Lye/b$a;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    invoke-virtual {v0}, Lye/b$a;->a()Z

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    if-eqz v0, :cond_0

    .line 25
    .line 26
    const/4 v0, 0x1

    .line 27
    return v0

    .line 28
    :cond_0
    const/4 v0, 0x0

    .line 29
    return v0
.end method

.method public bridge synthetic F0()Lye/p;
    .locals 1

    .line 1
    invoke-virtual {p0}, LBe/V;->a()Lye/t0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public H(Lye/a;LXe/f;I)Lye/t0;
    .locals 13

    .line 1
    const-string v0, "newOwner"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "newName"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    new-instance v1, LBe/V;

    .line 12
    .line 13
    invoke-virtual {p0}, Lze/b;->getAnnotations()Lze/h;

    .line 14
    .line 15
    .line 16
    move-result-object v5

    .line 17
    const-string v0, "<get-annotations>(...)"

    .line 18
    .line 19
    invoke-static {v5, v0}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {p0}, LBe/X;->getType()Lqf/S;

    .line 23
    .line 24
    .line 25
    move-result-object v7

    .line 26
    const-string v0, "getType(...)"

    .line 27
    .line 28
    invoke-static {v7, v0}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {p0}, LBe/V;->B0()Z

    .line 32
    .line 33
    .line 34
    move-result v8

    .line 35
    invoke-virtual {p0}, LBe/V;->s0()Z

    .line 36
    .line 37
    .line 38
    move-result v9

    .line 39
    invoke-virtual {p0}, LBe/V;->r0()Z

    .line 40
    .line 41
    .line 42
    move-result v10

    .line 43
    invoke-virtual {p0}, LBe/V;->v0()Lqf/S;

    .line 44
    .line 45
    .line 46
    move-result-object v11

    .line 47
    sget-object v12, Lye/h0;->a:Lye/h0;

    .line 48
    .line 49
    const-string v0, "NO_SOURCE"

    .line 50
    .line 51
    invoke-static {v12, v0}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    const/4 v3, 0x0

    .line 55
    move-object v2, p1

    .line 56
    move-object v6, p2

    .line 57
    move/from16 v4, p3

    .line 58
    .line 59
    invoke-direct/range {v1 .. v12}, LBe/V;-><init>(Lye/a;Lye/t0;ILze/h;LXe/f;Lqf/S;ZZZLqf/S;Lye/h0;)V

    .line 60
    .line 61
    .line 62
    return-object v1
.end method

.method public L0()Ljava/lang/Void;
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return-object v0
.end method

.method public M0(Lqf/G0;)Lye/t0;
    .locals 1

    .line 1
    const-string v0, "substitutor"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Lqf/G0;->k()Z

    .line 7
    .line 8
    .line 9
    move-result p1

    .line 10
    if-eqz p1, :cond_0

    .line 11
    .line 12
    return-object p0

    .line 13
    :cond_0
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    .line 14
    .line 15
    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    .line 16
    .line 17
    .line 18
    throw p1
.end method

.method public N()Z
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return v0
.end method

.method public bridge synthetic a()Lye/a;
    .locals 1

    .line 1
    invoke-virtual {p0}, LBe/V;->a()Lye/t0;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic a()Lye/m;
    .locals 1

    .line 2
    invoke-virtual {p0}, LBe/V;->a()Lye/t0;

    move-result-object v0

    return-object v0
.end method

.method public a()Lye/t0;
    .locals 1

    .line 3
    iget-object v0, p0, LBe/V;->k:Lye/t0;

    if-ne v0, p0, :cond_0

    return-object p0

    :cond_0
    invoke-interface {v0}, Lye/t0;->a()Lye/t0;

    move-result-object v0

    return-object v0
.end method

.method public b()Lye/a;
    .locals 2

    .line 2
    invoke-super {p0}, LBe/n;->b()Lye/m;

    move-result-object v0

    const-string v1, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.CallableDescriptor"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lye/a;

    return-object v0
.end method

.method public bridge synthetic b()Lye/m;
    .locals 1

    .line 1
    invoke-virtual {p0}, LBe/V;->b()Lye/a;

    move-result-object v0

    return-object v0
.end method

.method public b0(Lye/o;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    const-string v0, "visitor"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-interface {p1, p0, p2}, Lye/o;->h(Lye/t0;Ljava/lang/Object;)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    return-object p1
.end method

.method public bridge synthetic c(Lqf/G0;)Lye/n;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, LBe/V;->M0(Lqf/G0;)Lye/t0;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public e()Ljava/util/Collection;
    .locals 4

    .line 1
    invoke-virtual {p0}, LBe/V;->b()Lye/a;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-interface {v0}, Lye/a;->e()Ljava/util/Collection;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    const-string v1, "getOverriddenDescriptors(...)"

    .line 10
    .line 11
    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    check-cast v0, Ljava/lang/Iterable;

    .line 15
    .line 16
    new-instance v1, Ljava/util/ArrayList;

    .line 17
    .line 18
    const/16 v2, 0xa

    .line 19
    .line 20
    invoke-static {v0, v2}, LUd/u;->x(Ljava/lang/Iterable;I)I

    .line 21
    .line 22
    .line 23
    move-result v2

    .line 24
    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 25
    .line 26
    .line 27
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 32
    .line 33
    .line 34
    move-result v2

    .line 35
    if-eqz v2, :cond_0

    .line 36
    .line 37
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v2

    .line 41
    check-cast v2, Lye/a;

    .line 42
    .line 43
    invoke-interface {v2}, Lye/a;->j()Ljava/util/List;

    .line 44
    .line 45
    .line 46
    move-result-object v2

    .line 47
    invoke-virtual {p0}, LBe/V;->getIndex()I

    .line 48
    .line 49
    .line 50
    move-result v3

    .line 51
    invoke-interface {v2, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object v2

    .line 55
    check-cast v2, Lye/t0;

    .line 56
    .line 57
    invoke-interface {v1, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 58
    .line 59
    .line 60
    goto :goto_0

    .line 61
    :cond_0
    return-object v1
.end method

.method public getIndex()I
    .locals 1

    .line 1
    iget v0, p0, LBe/V;->f:I

    .line 2
    .line 3
    return v0
.end method

.method public getVisibility()Lye/u;
    .locals 2

    .line 1
    sget-object v0, Lye/t;->f:Lye/u;

    .line 2
    .line 3
    const-string v1, "LOCAL"

    .line 4
    .line 5
    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    return-object v0
.end method

.method public bridge synthetic q0()Ldf/g;
    .locals 1

    .line 1
    invoke-virtual {p0}, LBe/V;->L0()Ljava/lang/Void;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, Ldf/g;

    .line 6
    .line 7
    return-object v0
.end method

.method public r0()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, LBe/V;->i:Z

    .line 2
    .line 3
    return v0
.end method

.method public s0()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, LBe/V;->h:Z

    .line 2
    .line 3
    return v0
.end method

.method public v0()Lqf/S;
    .locals 1

    .line 1
    iget-object v0, p0, LBe/V;->j:Lqf/S;

    .line 2
    .line 3
    return-object v0
.end method
