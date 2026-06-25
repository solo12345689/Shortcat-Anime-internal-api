.class public final Lsf/f;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lye/Z;


# instance fields
.field private final synthetic a:LBe/K;


# direct methods
.method public constructor <init>()V
    .locals 21

    .line 1
    invoke-direct/range {p0 .. p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    sget-object v0, Lsf/l;->a:Lsf/l;

    .line 5
    .line 6
    invoke-virtual {v0}, Lsf/l;->h()Lsf/a;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    sget-object v2, Lze/h;->k0:Lze/h$a;

    .line 11
    .line 12
    invoke-virtual {v2}, Lze/h$a;->b()Lze/h;

    .line 13
    .line 14
    .line 15
    move-result-object v2

    .line 16
    sget-object v3, Lye/E;->d:Lye/E;

    .line 17
    .line 18
    sget-object v4, Lye/t;->e:Lye/u;

    .line 19
    .line 20
    sget-object v5, Lsf/b;->f:Lsf/b;

    .line 21
    .line 22
    invoke-virtual {v5}, Lsf/b;->b()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v5

    .line 26
    invoke-static {v5}, LXe/f;->q(Ljava/lang/String;)LXe/f;

    .line 27
    .line 28
    .line 29
    move-result-object v6

    .line 30
    sget-object v7, Lye/b$a;->a:Lye/b$a;

    .line 31
    .line 32
    sget-object v8, Lye/h0;->a:Lye/h0;

    .line 33
    .line 34
    const/4 v13, 0x0

    .line 35
    const/4 v14, 0x0

    .line 36
    const/4 v5, 0x1

    .line 37
    const/4 v9, 0x0

    .line 38
    const/4 v10, 0x0

    .line 39
    const/4 v11, 0x0

    .line 40
    const/4 v12, 0x0

    .line 41
    invoke-static/range {v1 .. v14}, LBe/K;->O0(Lye/m;Lze/h;Lye/E;Lye/u;ZLXe/f;Lye/b$a;Lye/h0;ZZZZZZ)LBe/K;

    .line 42
    .line 43
    .line 44
    move-result-object v15

    .line 45
    invoke-virtual {v0}, Lsf/l;->k()Lqf/S;

    .line 46
    .line 47
    .line 48
    move-result-object v16

    .line 49
    invoke-static {}, LUd/u;->m()Ljava/util/List;

    .line 50
    .line 51
    .line 52
    move-result-object v17

    .line 53
    const/16 v19, 0x0

    .line 54
    .line 55
    invoke-static {}, LUd/u;->m()Ljava/util/List;

    .line 56
    .line 57
    .line 58
    move-result-object v20

    .line 59
    const/16 v18, 0x0

    .line 60
    .line 61
    invoke-virtual/range {v15 .. v20}, LBe/K;->b1(Lqf/S;Ljava/util/List;Lye/c0;Lye/c0;Ljava/util/List;)V

    .line 62
    .line 63
    .line 64
    move-object/from16 v0, p0

    .line 65
    .line 66
    iput-object v15, v0, Lsf/f;->a:LBe/K;

    .line 67
    .line 68
    return-void
.end method


# virtual methods
.method public B()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lsf/f;->a:LBe/K;

    .line 2
    .line 3
    invoke-virtual {v0}, LBe/K;->B()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public E0(Ljava/util/Collection;)V
    .locals 1

    .line 1
    const-string v0, "overriddenDescriptors"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lsf/f;->a:LBe/K;

    .line 7
    .line 8
    invoke-virtual {v0, p1}, LBe/K;->E0(Ljava/util/Collection;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public K()Lye/c0;
    .locals 1

    .line 1
    iget-object v0, p0, Lsf/f;->a:LBe/K;

    .line 2
    .line 3
    invoke-virtual {v0}, LBe/K;->K()Lye/c0;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public N()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lsf/f;->a:LBe/K;

    .line 2
    .line 3
    invoke-virtual {v0}, LBe/Y;->N()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public O()Lye/c0;
    .locals 1

    .line 1
    iget-object v0, p0, Lsf/f;->a:LBe/K;

    .line 2
    .line 3
    invoke-virtual {v0}, LBe/K;->O()Lye/c0;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public P()Lye/w;
    .locals 1

    .line 1
    iget-object v0, p0, Lsf/f;->a:LBe/K;

    .line 2
    .line 3
    invoke-virtual {v0}, LBe/K;->P()Lye/w;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public Y()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lsf/f;->a:LBe/K;

    .line 2
    .line 3
    invoke-virtual {v0}, LBe/K;->Y()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public a()Lye/Z;
    .locals 2

    .line 1
    iget-object v0, p0, Lsf/f;->a:LBe/K;

    invoke-virtual {v0}, LBe/K;->a()Lye/Z;

    move-result-object v0

    const-string v1, "getOriginal(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public bridge synthetic a()Lye/a;
    .locals 1

    .line 2
    invoke-virtual {p0}, Lsf/f;->a()Lye/Z;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic a()Lye/b;
    .locals 1

    .line 3
    invoke-virtual {p0}, Lsf/f;->a()Lye/Z;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic a()Lye/m;
    .locals 1

    .line 4
    invoke-virtual {p0}, Lsf/f;->a()Lye/Z;

    move-result-object v0

    return-object v0
.end method

.method public b()Lye/m;
    .locals 2

    .line 1
    iget-object v0, p0, Lsf/f;->a:LBe/K;

    .line 2
    .line 3
    invoke-virtual {v0}, LBe/n;->b()Lye/m;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const-string v1, "getContainingDeclaration(...)"

    .line 8
    .line 9
    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    return-object v0
.end method

.method public b0(Lye/o;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lsf/f;->a:LBe/K;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2}, LBe/K;->b0(Lye/o;Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method

.method public c(Lqf/G0;)Lye/Z;
    .locals 1

    .line 1
    const-string v0, "substitutor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lsf/f;->a:LBe/K;

    invoke-virtual {v0, p1}, LBe/K;->c(Lqf/G0;)Lye/Z;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic c(Lqf/G0;)Lye/n;
    .locals 0

    .line 2
    invoke-virtual {p0, p1}, Lsf/f;->c(Lqf/G0;)Lye/Z;

    move-result-object p1

    return-object p1
.end method

.method public d()Lye/a0;
    .locals 1

    .line 1
    iget-object v0, p0, Lsf/f;->a:LBe/K;

    .line 2
    .line 3
    invoke-virtual {v0}, LBe/K;->R0()LBe/L;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public d0()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lsf/f;->a:LBe/K;

    .line 2
    .line 3
    invoke-virtual {v0}, LBe/K;->d0()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public e()Ljava/util/Collection;
    .locals 2

    .line 1
    iget-object v0, p0, Lsf/f;->a:LBe/K;

    .line 2
    .line 3
    invoke-virtual {v0}, LBe/K;->e()Ljava/util/Collection;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const-string v1, "getOverriddenDescriptors(...)"

    .line 8
    .line 9
    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    return-object v0
.end method

.method public g()Lye/b0;
    .locals 1

    .line 1
    iget-object v0, p0, Lsf/f;->a:LBe/K;

    .line 2
    .line 3
    invoke-virtual {v0}, LBe/K;->g()Lye/b0;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public getAnnotations()Lze/h;
    .locals 2

    .line 1
    iget-object v0, p0, Lsf/f;->a:LBe/K;

    .line 2
    .line 3
    invoke-virtual {v0}, Lze/b;->getAnnotations()Lze/h;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const-string v1, "<get-annotations>(...)"

    .line 8
    .line 9
    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    return-object v0
.end method

.method public getName()LXe/f;
    .locals 2

    .line 1
    iget-object v0, p0, Lsf/f;->a:LBe/K;

    .line 2
    .line 3
    invoke-virtual {v0}, LBe/m;->getName()LXe/f;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const-string v1, "getName(...)"

    .line 8
    .line 9
    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    return-object v0
.end method

.method public getReturnType()Lqf/S;
    .locals 1

    .line 1
    iget-object v0, p0, Lsf/f;->a:LBe/K;

    .line 2
    .line 3
    invoke-virtual {v0}, LBe/K;->getReturnType()Lqf/S;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public getType()Lqf/S;
    .locals 2

    .line 1
    iget-object v0, p0, Lsf/f;->a:LBe/K;

    .line 2
    .line 3
    invoke-virtual {v0}, LBe/X;->getType()Lqf/S;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const-string v1, "getType(...)"

    .line 8
    .line 9
    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    return-object v0
.end method

.method public getTypeParameters()Ljava/util/List;
    .locals 2

    .line 1
    iget-object v0, p0, Lsf/f;->a:LBe/K;

    .line 2
    .line 3
    invoke-virtual {v0}, LBe/K;->getTypeParameters()Ljava/util/List;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const-string v1, "getTypeParameters(...)"

    .line 8
    .line 9
    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    return-object v0
.end method

.method public getVisibility()Lye/u;
    .locals 2

    .line 1
    iget-object v0, p0, Lsf/f;->a:LBe/K;

    .line 2
    .line 3
    invoke-virtual {v0}, LBe/K;->getVisibility()Lye/u;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const-string v1, "getVisibility(...)"

    .line 8
    .line 9
    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    return-object v0
.end method

.method public h()Lye/b$a;
    .locals 2

    .line 1
    iget-object v0, p0, Lsf/f;->a:LBe/K;

    .line 2
    .line 3
    invoke-virtual {v0}, LBe/K;->h()Lye/b$a;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const-string v1, "getKind(...)"

    .line 8
    .line 9
    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    return-object v0
.end method

.method public i0()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lsf/f;->a:LBe/K;

    .line 2
    .line 3
    invoke-virtual {v0}, LBe/X;->i0()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public isExternal()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lsf/f;->a:LBe/K;

    .line 2
    .line 3
    invoke-virtual {v0}, LBe/K;->isExternal()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public j()Ljava/util/List;
    .locals 2

    .line 1
    iget-object v0, p0, Lsf/f;->a:LBe/K;

    .line 2
    .line 3
    invoke-virtual {v0}, LBe/X;->j()Ljava/util/List;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const-string v1, "getValueParameters(...)"

    .line 8
    .line 9
    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    return-object v0
.end method

.method public k()Lye/h0;
    .locals 2

    .line 1
    iget-object v0, p0, Lsf/f;->a:LBe/K;

    .line 2
    .line 3
    invoke-virtual {v0}, LBe/n;->k()Lye/h0;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const-string v1, "getSource(...)"

    .line 8
    .line 9
    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    return-object v0
.end method

.method public l0(Lye/m;Lye/E;Lye/u;Lye/b$a;Z)Lye/b;
    .locals 6

    .line 1
    iget-object v0, p0, Lsf/f;->a:LBe/K;

    .line 2
    .line 3
    move-object v1, p1

    .line 4
    move-object v2, p2

    .line 5
    move-object v3, p3

    .line 6
    move-object v4, p4

    .line 7
    move v5, p5

    .line 8
    invoke-virtual/range {v0 .. v5}, LBe/K;->N0(Lye/m;Lye/E;Lye/u;Lye/b$a;Z)Lye/Z;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    const-string p2, "copy(...)"

    .line 13
    .line 14
    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    return-object p1
.end method

.method public m0()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lsf/f;->a:LBe/K;

    .line 2
    .line 3
    invoke-virtual {v0}, LBe/K;->m0()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public n0(Lye/a$a;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lsf/f;->a:LBe/K;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, LBe/K;->n0(Lye/a$a;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method

.method public q0()Ldf/g;
    .locals 1

    .line 1
    iget-object v0, p0, Lsf/f;->a:LBe/K;

    .line 2
    .line 3
    invoke-virtual {v0}, LBe/Y;->q0()Ldf/g;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public r()Lye/E;
    .locals 2

    .line 1
    iget-object v0, p0, Lsf/f;->a:LBe/K;

    .line 2
    .line 3
    invoke-virtual {v0}, LBe/K;->r()Lye/E;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const-string v1, "getModality(...)"

    .line 8
    .line 9
    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    return-object v0
.end method

.method public w()Ljava/util/List;
    .locals 2

    .line 1
    iget-object v0, p0, Lsf/f;->a:LBe/K;

    .line 2
    .line 3
    invoke-virtual {v0}, LBe/K;->w()Ljava/util/List;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const-string v1, "getAccessors(...)"

    .line 8
    .line 9
    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    return-object v0
.end method

.method public w0()Lye/w;
    .locals 1

    .line 1
    iget-object v0, p0, Lsf/f;->a:LBe/K;

    .line 2
    .line 3
    invoke-virtual {v0}, LBe/K;->w0()Lye/w;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public y0()Ljava/util/List;
    .locals 2

    .line 1
    iget-object v0, p0, Lsf/f;->a:LBe/K;

    .line 2
    .line 3
    invoke-virtual {v0}, LBe/K;->y0()Ljava/util/List;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const-string v1, "getContextReceiverParameters(...)"

    .line 8
    .line 9
    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    return-object v0
.end method

.method public z0()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lsf/f;->a:LBe/K;

    .line 2
    .line 3
    invoke-virtual {v0}, LBe/K;->z0()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method
