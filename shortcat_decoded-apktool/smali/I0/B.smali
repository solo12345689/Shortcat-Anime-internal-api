.class public interface abstract LI0/B;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# virtual methods
.method public maxIntrinsicHeight(LI0/m;Ljava/util/List;I)I
    .locals 9

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-interface {p2}, Ljava/util/List;->size()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 8
    .line 9
    .line 10
    invoke-interface {p2}, Ljava/util/Collection;->size()I

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    const/4 v2, 0x0

    .line 15
    :goto_0
    if-ge v2, v1, :cond_0

    .line 16
    .line 17
    invoke-interface {p2, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v3

    .line 21
    check-cast v3, LI0/l;

    .line 22
    .line 23
    new-instance v4, LI0/h;

    .line 24
    .line 25
    sget-object v5, LI0/n;->b:LI0/n;

    .line 26
    .line 27
    sget-object v6, LI0/o;->b:LI0/o;

    .line 28
    .line 29
    invoke-direct {v4, v3, v5, v6}, LI0/h;-><init>(LI0/l;LI0/n;LI0/o;)V

    .line 30
    .line 31
    .line 32
    invoke-interface {v0, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 33
    .line 34
    .line 35
    add-int/lit8 v2, v2, 0x1

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_0
    const/16 v7, 0xd

    .line 39
    .line 40
    const/4 v8, 0x0

    .line 41
    const/4 v3, 0x0

    .line 42
    const/4 v5, 0x0

    .line 43
    const/4 v6, 0x0

    .line 44
    move v4, p3

    .line 45
    invoke-static/range {v3 .. v8}, Li1/c;->b(IIIIILjava/lang/Object;)J

    .line 46
    .line 47
    .line 48
    move-result-wide p2

    .line 49
    new-instance v1, Landroidx/compose/ui/layout/g;

    .line 50
    .line 51
    invoke-interface {p1}, LI0/m;->getLayoutDirection()Li1/t;

    .line 52
    .line 53
    .line 54
    move-result-object v2

    .line 55
    invoke-direct {v1, p1, v2}, Landroidx/compose/ui/layout/g;-><init>(LI0/m;Li1/t;)V

    .line 56
    .line 57
    .line 58
    invoke-interface {p0, v1, v0, p2, p3}, LI0/B;->measure-3p2s80s(Landroidx/compose/ui/layout/l;Ljava/util/List;J)LI0/C;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    invoke-interface {p1}, LI0/C;->getHeight()I

    .line 63
    .line 64
    .line 65
    move-result p1

    .line 66
    return p1
.end method

.method public maxIntrinsicWidth(LI0/m;Ljava/util/List;I)I
    .locals 9

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-interface {p2}, Ljava/util/List;->size()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 8
    .line 9
    .line 10
    invoke-interface {p2}, Ljava/util/Collection;->size()I

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    const/4 v2, 0x0

    .line 15
    :goto_0
    if-ge v2, v1, :cond_0

    .line 16
    .line 17
    invoke-interface {p2, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v3

    .line 21
    check-cast v3, LI0/l;

    .line 22
    .line 23
    new-instance v4, LI0/h;

    .line 24
    .line 25
    sget-object v5, LI0/n;->b:LI0/n;

    .line 26
    .line 27
    sget-object v6, LI0/o;->a:LI0/o;

    .line 28
    .line 29
    invoke-direct {v4, v3, v5, v6}, LI0/h;-><init>(LI0/l;LI0/n;LI0/o;)V

    .line 30
    .line 31
    .line 32
    invoke-interface {v0, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 33
    .line 34
    .line 35
    add-int/lit8 v2, v2, 0x1

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_0
    const/4 v7, 0x7

    .line 39
    const/4 v8, 0x0

    .line 40
    const/4 v3, 0x0

    .line 41
    const/4 v4, 0x0

    .line 42
    const/4 v5, 0x0

    .line 43
    move v6, p3

    .line 44
    invoke-static/range {v3 .. v8}, Li1/c;->b(IIIIILjava/lang/Object;)J

    .line 45
    .line 46
    .line 47
    move-result-wide p2

    .line 48
    new-instance v1, Landroidx/compose/ui/layout/g;

    .line 49
    .line 50
    invoke-interface {p1}, LI0/m;->getLayoutDirection()Li1/t;

    .line 51
    .line 52
    .line 53
    move-result-object v2

    .line 54
    invoke-direct {v1, p1, v2}, Landroidx/compose/ui/layout/g;-><init>(LI0/m;Li1/t;)V

    .line 55
    .line 56
    .line 57
    invoke-interface {p0, v1, v0, p2, p3}, LI0/B;->measure-3p2s80s(Landroidx/compose/ui/layout/l;Ljava/util/List;J)LI0/C;

    .line 58
    .line 59
    .line 60
    move-result-object p1

    .line 61
    invoke-interface {p1}, LI0/C;->getWidth()I

    .line 62
    .line 63
    .line 64
    move-result p1

    .line 65
    return p1
.end method

.method public abstract measure-3p2s80s(Landroidx/compose/ui/layout/l;Ljava/util/List;J)LI0/C;
.end method

.method public minIntrinsicHeight(LI0/m;Ljava/util/List;I)I
    .locals 9

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-interface {p2}, Ljava/util/List;->size()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 8
    .line 9
    .line 10
    invoke-interface {p2}, Ljava/util/Collection;->size()I

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    const/4 v2, 0x0

    .line 15
    :goto_0
    if-ge v2, v1, :cond_0

    .line 16
    .line 17
    invoke-interface {p2, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v3

    .line 21
    check-cast v3, LI0/l;

    .line 22
    .line 23
    new-instance v4, LI0/h;

    .line 24
    .line 25
    sget-object v5, LI0/n;->a:LI0/n;

    .line 26
    .line 27
    sget-object v6, LI0/o;->b:LI0/o;

    .line 28
    .line 29
    invoke-direct {v4, v3, v5, v6}, LI0/h;-><init>(LI0/l;LI0/n;LI0/o;)V

    .line 30
    .line 31
    .line 32
    invoke-interface {v0, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 33
    .line 34
    .line 35
    add-int/lit8 v2, v2, 0x1

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_0
    const/16 v7, 0xd

    .line 39
    .line 40
    const/4 v8, 0x0

    .line 41
    const/4 v3, 0x0

    .line 42
    const/4 v5, 0x0

    .line 43
    const/4 v6, 0x0

    .line 44
    move v4, p3

    .line 45
    invoke-static/range {v3 .. v8}, Li1/c;->b(IIIIILjava/lang/Object;)J

    .line 46
    .line 47
    .line 48
    move-result-wide p2

    .line 49
    new-instance v1, Landroidx/compose/ui/layout/g;

    .line 50
    .line 51
    invoke-interface {p1}, LI0/m;->getLayoutDirection()Li1/t;

    .line 52
    .line 53
    .line 54
    move-result-object v2

    .line 55
    invoke-direct {v1, p1, v2}, Landroidx/compose/ui/layout/g;-><init>(LI0/m;Li1/t;)V

    .line 56
    .line 57
    .line 58
    invoke-interface {p0, v1, v0, p2, p3}, LI0/B;->measure-3p2s80s(Landroidx/compose/ui/layout/l;Ljava/util/List;J)LI0/C;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    invoke-interface {p1}, LI0/C;->getHeight()I

    .line 63
    .line 64
    .line 65
    move-result p1

    .line 66
    return p1
.end method

.method public minIntrinsicWidth(LI0/m;Ljava/util/List;I)I
    .locals 9

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-interface {p2}, Ljava/util/List;->size()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 8
    .line 9
    .line 10
    invoke-interface {p2}, Ljava/util/Collection;->size()I

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    const/4 v2, 0x0

    .line 15
    :goto_0
    if-ge v2, v1, :cond_0

    .line 16
    .line 17
    invoke-interface {p2, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v3

    .line 21
    check-cast v3, LI0/l;

    .line 22
    .line 23
    new-instance v4, LI0/h;

    .line 24
    .line 25
    sget-object v5, LI0/n;->a:LI0/n;

    .line 26
    .line 27
    sget-object v6, LI0/o;->a:LI0/o;

    .line 28
    .line 29
    invoke-direct {v4, v3, v5, v6}, LI0/h;-><init>(LI0/l;LI0/n;LI0/o;)V

    .line 30
    .line 31
    .line 32
    invoke-interface {v0, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 33
    .line 34
    .line 35
    add-int/lit8 v2, v2, 0x1

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_0
    const/4 v7, 0x7

    .line 39
    const/4 v8, 0x0

    .line 40
    const/4 v3, 0x0

    .line 41
    const/4 v4, 0x0

    .line 42
    const/4 v5, 0x0

    .line 43
    move v6, p3

    .line 44
    invoke-static/range {v3 .. v8}, Li1/c;->b(IIIIILjava/lang/Object;)J

    .line 45
    .line 46
    .line 47
    move-result-wide p2

    .line 48
    new-instance v1, Landroidx/compose/ui/layout/g;

    .line 49
    .line 50
    invoke-interface {p1}, LI0/m;->getLayoutDirection()Li1/t;

    .line 51
    .line 52
    .line 53
    move-result-object v2

    .line 54
    invoke-direct {v1, p1, v2}, Landroidx/compose/ui/layout/g;-><init>(LI0/m;Li1/t;)V

    .line 55
    .line 56
    .line 57
    invoke-interface {p0, v1, v0, p2, p3}, LI0/B;->measure-3p2s80s(Landroidx/compose/ui/layout/l;Ljava/util/List;J)LI0/C;

    .line 58
    .line 59
    .line 60
    move-result-object p1

    .line 61
    invoke-interface {p1}, LI0/C;->getWidth()I

    .line 62
    .line 63
    .line 64
    move-result p1

    .line 65
    return p1
.end method
