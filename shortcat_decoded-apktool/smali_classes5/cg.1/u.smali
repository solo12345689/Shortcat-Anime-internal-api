.class public final Lcg/u;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lcg/t;


# instance fields
.field public final a:LM3/q;

.field public final b:LM3/i;

.field public final c:LM3/h;

.field public final d:LM3/w;

.field public final e:LM3/w;


# direct methods
.method public constructor <init>(LM3/q;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcg/u;->a:LM3/q;

    .line 5
    .line 6
    new-instance v0, Lcg/u$a;

    .line 7
    .line 8
    invoke-direct {v0, p0, p1}, Lcg/u$a;-><init>(Lcg/u;LM3/q;)V

    .line 9
    .line 10
    .line 11
    iput-object v0, p0, Lcg/u;->b:LM3/i;

    .line 12
    .line 13
    new-instance v0, Lcg/u$b;

    .line 14
    .line 15
    invoke-direct {v0, p0, p1}, Lcg/u$b;-><init>(Lcg/u;LM3/q;)V

    .line 16
    .line 17
    .line 18
    iput-object v0, p0, Lcg/u;->c:LM3/h;

    .line 19
    .line 20
    new-instance v0, Lcg/u$c;

    .line 21
    .line 22
    invoke-direct {v0, p0, p1}, Lcg/u$c;-><init>(Lcg/u;LM3/q;)V

    .line 23
    .line 24
    .line 25
    iput-object v0, p0, Lcg/u;->d:LM3/w;

    .line 26
    .line 27
    new-instance v0, Lcg/u$d;

    .line 28
    .line 29
    invoke-direct {v0, p0, p1}, Lcg/u$d;-><init>(Lcg/u;LM3/q;)V

    .line 30
    .line 31
    .line 32
    iput-object v0, p0, Lcg/u;->e:LM3/w;

    .line 33
    .line 34
    return-void
.end method


# virtual methods
.method public a()Ljava/util/List;
    .locals 14

    .line 13
    const-string v0, "SELECT * FROM work_data"

    const/4 v1, 0x0

    invoke-static {v0, v1}, LM3/t;->g(Ljava/lang/String;I)LM3/t;

    move-result-object v0

    .line 14
    iget-object v2, p0, Lcg/u;->a:LM3/q;

    invoke-virtual {v2}, LM3/q;->d()V

    .line 15
    iget-object v2, p0, Lcg/u;->a:LM3/q;

    const/4 v3, 0x0

    invoke-static {v2, v0, v1, v3}, LO3/b;->b(LM3/q;LS3/j;ZLandroid/os/CancellationSignal;)Landroid/database/Cursor;

    move-result-object v2

    .line 16
    :try_start_0
    const-string v4, "id"

    invoke-static {v2, v4}, LO3/a;->e(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v4

    .line 17
    const-string v5, "notification"

    invoke-static {v2, v5}, LO3/a;->e(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v5

    .line 18
    const-string v6, "trigger"

    invoke-static {v2, v6}, LO3/a;->e(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v6

    .line 19
    const-string v7, "with_alarm_manager"

    invoke-static {v2, v7}, LO3/a;->e(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v7

    .line 20
    new-instance v8, Ljava/util/ArrayList;

    invoke-interface {v2}, Landroid/database/Cursor;->getCount()I

    move-result v9

    invoke-direct {v8, v9}, Ljava/util/ArrayList;-><init>(I)V

    .line 21
    :goto_0
    invoke-interface {v2}, Landroid/database/Cursor;->moveToNext()Z

    move-result v9

    if-eqz v9, :cond_6

    .line 22
    invoke-interface {v2, v4}, Landroid/database/Cursor;->isNull(I)Z

    move-result v9

    if-eqz v9, :cond_0

    move-object v9, v3

    goto :goto_1

    .line 23
    :cond_0
    invoke-interface {v2, v4}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v9

    .line 24
    :goto_1
    invoke-interface {v2, v5}, Landroid/database/Cursor;->isNull(I)Z

    move-result v10

    if-eqz v10, :cond_1

    move-object v10, v3

    goto :goto_2

    .line 25
    :cond_1
    invoke-interface {v2, v5}, Landroid/database/Cursor;->getBlob(I)[B

    move-result-object v10

    .line 26
    :goto_2
    invoke-interface {v2, v6}, Landroid/database/Cursor;->isNull(I)Z

    move-result v11

    if-eqz v11, :cond_2

    move-object v11, v3

    goto :goto_3

    .line 27
    :cond_2
    invoke-interface {v2, v6}, Landroid/database/Cursor;->getBlob(I)[B

    move-result-object v11

    .line 28
    :goto_3
    invoke-interface {v2, v7}, Landroid/database/Cursor;->isNull(I)Z

    move-result v12

    if-eqz v12, :cond_3

    move-object v12, v3

    goto :goto_4

    .line 29
    :cond_3
    invoke-interface {v2, v7}, Landroid/database/Cursor;->getInt(I)I

    move-result v12

    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    :goto_4
    if-nez v12, :cond_4

    move-object v12, v3

    goto :goto_6

    .line 30
    :cond_4
    invoke-virtual {v12}, Ljava/lang/Integer;->intValue()I

    move-result v12

    if-eqz v12, :cond_5

    const/4 v12, 0x1

    goto :goto_5

    :cond_5
    move v12, v1

    :goto_5
    invoke-static {v12}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v12

    .line 31
    :goto_6
    new-instance v13, Lcg/v;

    invoke-direct {v13, v9, v10, v11, v12}, Lcg/v;-><init>(Ljava/lang/String;[B[BLjava/lang/Boolean;)V

    .line 32
    invoke-virtual {v8, v13}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v1

    goto :goto_7

    .line 33
    :cond_6
    invoke-interface {v2}, Landroid/database/Cursor;->close()V

    .line 34
    invoke-virtual {v0}, LM3/t;->k()V

    return-object v8

    .line 35
    :goto_7
    invoke-interface {v2}, Landroid/database/Cursor;->close()V

    .line 36
    invoke-virtual {v0}, LM3/t;->k()V

    .line 37
    throw v1
.end method

.method public a(Ljava/lang/String;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcg/u;->a:LM3/q;

    invoke-virtual {v0}, LM3/q;->d()V

    .line 2
    iget-object v0, p0, Lcg/u;->e:LM3/w;

    invoke-virtual {v0}, LM3/w;->b()LS3/k;

    move-result-object v0

    const/4 v1, 0x1

    if-nez p1, :cond_0

    .line 3
    invoke-interface {v0, v1}, LS3/i;->I1(I)V

    goto :goto_0

    .line 4
    :cond_0
    invoke-interface {v0, v1, p1}, LS3/i;->Z0(ILjava/lang/String;)V

    .line 5
    :goto_0
    iget-object p1, p0, Lcg/u;->a:LM3/q;

    invoke-virtual {p1}, LM3/q;->e()V

    .line 6
    :try_start_0
    invoke-interface {v0}, LS3/k;->Z()I

    .line 7
    iget-object p1, p0, Lcg/u;->a:LM3/q;

    invoke-virtual {p1}, LM3/q;->B()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 8
    iget-object p1, p0, Lcg/u;->a:LM3/q;

    invoke-virtual {p1}, LM3/q;->i()V

    .line 9
    iget-object p1, p0, Lcg/u;->e:LM3/w;

    invoke-virtual {p1, v0}, LM3/w;->h(LS3/k;)V

    return-void

    :catchall_0
    move-exception p1

    .line 10
    iget-object v1, p0, Lcg/u;->a:LM3/q;

    invoke-virtual {v1}, LM3/q;->i()V

    .line 11
    iget-object v1, p0, Lcg/u;->e:LM3/w;

    invoke-virtual {v1, v0}, LM3/w;->h(LS3/k;)V

    .line 12
    throw p1
.end method

.method public a(Ljava/util/List;)V
    .locals 3

    .line 38
    iget-object v0, p0, Lcg/u;->a:LM3/q;

    invoke-virtual {v0}, LM3/q;->d()V

    .line 39
    invoke-static {}, LO3/d;->b()Ljava/lang/StringBuilder;

    move-result-object v0

    .line 40
    const-string v1, "DELETE FROM work_data WHERE id in ("

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 41
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v1

    .line 42
    invoke-static {v0, v1}, LO3/d;->a(Ljava/lang/StringBuilder;I)V

    .line 43
    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 44
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 45
    iget-object v1, p0, Lcg/u;->a:LM3/q;

    invoke-virtual {v1, v0}, LM3/q;->f(Ljava/lang/String;)LS3/k;

    move-result-object v0

    .line 46
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    const/4 v1, 0x1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    if-nez v2, :cond_0

    .line 47
    invoke-interface {v0, v1}, LS3/i;->I1(I)V

    goto :goto_1

    .line 48
    :cond_0
    invoke-interface {v0, v1, v2}, LS3/i;->Z0(ILjava/lang/String;)V

    :goto_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 49
    :cond_1
    iget-object p1, p0, Lcg/u;->a:LM3/q;

    invoke-virtual {p1}, LM3/q;->e()V

    .line 50
    :try_start_0
    invoke-interface {v0}, LS3/k;->Z()I

    .line 51
    iget-object p1, p0, Lcg/u;->a:LM3/q;

    invoke-virtual {p1}, LM3/q;->B()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 52
    iget-object p1, p0, Lcg/u;->a:LM3/q;

    invoke-virtual {p1}, LM3/q;->i()V

    return-void

    :catchall_0
    move-exception p1

    iget-object v0, p0, Lcg/u;->a:LM3/q;

    invoke-virtual {v0}, LM3/q;->i()V

    .line 53
    throw p1
.end method

.method public b(Ljava/lang/String;)Lcg/v;
    .locals 9

    .line 11
    const-string v0, "SELECT * from work_data WHERE id = ?"

    const/4 v1, 0x1

    invoke-static {v0, v1}, LM3/t;->g(Ljava/lang/String;I)LM3/t;

    move-result-object v0

    if-nez p1, :cond_0

    .line 12
    invoke-virtual {v0, v1}, LM3/t;->I1(I)V

    goto :goto_0

    .line 13
    :cond_0
    invoke-virtual {v0, v1, p1}, LM3/t;->Z0(ILjava/lang/String;)V

    .line 14
    :goto_0
    iget-object p1, p0, Lcg/u;->a:LM3/q;

    invoke-virtual {p1}, LM3/q;->d()V

    .line 15
    iget-object p1, p0, Lcg/u;->a:LM3/q;

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static {p1, v0, v2, v3}, LO3/b;->b(LM3/q;LS3/j;ZLandroid/os/CancellationSignal;)Landroid/database/Cursor;

    move-result-object p1

    .line 16
    :try_start_0
    const-string v4, "id"

    invoke-static {p1, v4}, LO3/a;->e(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v4

    .line 17
    const-string v5, "notification"

    invoke-static {p1, v5}, LO3/a;->e(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v5

    .line 18
    const-string v6, "trigger"

    invoke-static {p1, v6}, LO3/a;->e(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v6

    .line 19
    const-string v7, "with_alarm_manager"

    invoke-static {p1, v7}, LO3/a;->e(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v7

    .line 20
    invoke-interface {p1}, Landroid/database/Cursor;->moveToFirst()Z

    move-result v8

    if-eqz v8, :cond_7

    .line 21
    invoke-interface {p1, v4}, Landroid/database/Cursor;->isNull(I)Z

    move-result v8

    if-eqz v8, :cond_1

    move-object v4, v3

    goto :goto_1

    .line 22
    :cond_1
    invoke-interface {p1, v4}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v4

    .line 23
    :goto_1
    invoke-interface {p1, v5}, Landroid/database/Cursor;->isNull(I)Z

    move-result v8

    if-eqz v8, :cond_2

    move-object v5, v3

    goto :goto_2

    .line 24
    :cond_2
    invoke-interface {p1, v5}, Landroid/database/Cursor;->getBlob(I)[B

    move-result-object v5

    .line 25
    :goto_2
    invoke-interface {p1, v6}, Landroid/database/Cursor;->isNull(I)Z

    move-result v8

    if-eqz v8, :cond_3

    move-object v6, v3

    goto :goto_3

    .line 26
    :cond_3
    invoke-interface {p1, v6}, Landroid/database/Cursor;->getBlob(I)[B

    move-result-object v6

    .line 27
    :goto_3
    invoke-interface {p1, v7}, Landroid/database/Cursor;->isNull(I)Z

    move-result v8

    if-eqz v8, :cond_4

    move-object v7, v3

    goto :goto_4

    .line 28
    :cond_4
    invoke-interface {p1, v7}, Landroid/database/Cursor;->getInt(I)I

    move-result v7

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    :goto_4
    if-nez v7, :cond_5

    goto :goto_6

    .line 29
    :cond_5
    invoke-virtual {v7}, Ljava/lang/Integer;->intValue()I

    move-result v3

    if-eqz v3, :cond_6

    goto :goto_5

    :cond_6
    move v1, v2

    :goto_5
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    .line 30
    :goto_6
    new-instance v1, Lcg/v;

    invoke-direct {v1, v4, v5, v6, v3}, Lcg/v;-><init>(Ljava/lang/String;[B[BLjava/lang/Boolean;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-object v3, v1

    goto :goto_7

    :catchall_0
    move-exception v1

    goto :goto_8

    .line 31
    :cond_7
    :goto_7
    invoke-interface {p1}, Landroid/database/Cursor;->close()V

    .line 32
    invoke-virtual {v0}, LM3/t;->k()V

    return-object v3

    .line 33
    :goto_8
    invoke-interface {p1}, Landroid/database/Cursor;->close()V

    .line 34
    invoke-virtual {v0}, LM3/t;->k()V

    .line 35
    throw v1
.end method

.method public b()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcg/u;->a:LM3/q;

    invoke-virtual {v0}, LM3/q;->d()V

    .line 2
    iget-object v0, p0, Lcg/u;->d:LM3/w;

    invoke-virtual {v0}, LM3/w;->b()LS3/k;

    move-result-object v0

    .line 3
    iget-object v1, p0, Lcg/u;->a:LM3/q;

    invoke-virtual {v1}, LM3/q;->e()V

    .line 4
    :try_start_0
    invoke-interface {v0}, LS3/k;->Z()I

    .line 5
    iget-object v1, p0, Lcg/u;->a:LM3/q;

    invoke-virtual {v1}, LM3/q;->B()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 6
    iget-object v1, p0, Lcg/u;->a:LM3/q;

    invoke-virtual {v1}, LM3/q;->i()V

    .line 7
    iget-object v1, p0, Lcg/u;->d:LM3/w;

    invoke-virtual {v1, v0}, LM3/w;->h(LS3/k;)V

    return-void

    :catchall_0
    move-exception v1

    .line 8
    iget-object v2, p0, Lcg/u;->a:LM3/q;

    invoke-virtual {v2}, LM3/q;->i()V

    .line 9
    iget-object v2, p0, Lcg/u;->d:LM3/w;

    invoke-virtual {v2, v0}, LM3/w;->h(LS3/k;)V

    .line 10
    throw v1
.end method

.method public c(Lcg/v;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcg/u;->a:LM3/q;

    .line 2
    .line 3
    invoke-virtual {v0}, LM3/q;->d()V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcg/u;->a:LM3/q;

    .line 7
    .line 8
    invoke-virtual {v0}, LM3/q;->e()V

    .line 9
    .line 10
    .line 11
    :try_start_0
    iget-object v0, p0, Lcg/u;->b:LM3/i;

    .line 12
    .line 13
    invoke-virtual {v0, p1}, LM3/i;->j(Ljava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    iget-object p1, p0, Lcg/u;->a:LM3/q;

    .line 17
    .line 18
    invoke-virtual {p1}, LM3/q;->B()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 19
    .line 20
    .line 21
    iget-object p1, p0, Lcg/u;->a:LM3/q;

    .line 22
    .line 23
    invoke-virtual {p1}, LM3/q;->i()V

    .line 24
    .line 25
    .line 26
    return-void

    .line 27
    :catchall_0
    move-exception p1

    .line 28
    iget-object v0, p0, Lcg/u;->a:LM3/q;

    .line 29
    .line 30
    invoke-virtual {v0}, LM3/q;->i()V

    .line 31
    .line 32
    .line 33
    throw p1
.end method

.method public d(Lcg/v;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcg/u;->a:LM3/q;

    .line 2
    .line 3
    invoke-virtual {v0}, LM3/q;->d()V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcg/u;->a:LM3/q;

    .line 7
    .line 8
    invoke-virtual {v0}, LM3/q;->e()V

    .line 9
    .line 10
    .line 11
    :try_start_0
    iget-object v0, p0, Lcg/u;->c:LM3/h;

    .line 12
    .line 13
    invoke-virtual {v0, p1}, LM3/h;->j(Ljava/lang/Object;)I

    .line 14
    .line 15
    .line 16
    iget-object p1, p0, Lcg/u;->a:LM3/q;

    .line 17
    .line 18
    invoke-virtual {p1}, LM3/q;->B()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 19
    .line 20
    .line 21
    iget-object p1, p0, Lcg/u;->a:LM3/q;

    .line 22
    .line 23
    invoke-virtual {p1}, LM3/q;->i()V

    .line 24
    .line 25
    .line 26
    return-void

    .line 27
    :catchall_0
    move-exception p1

    .line 28
    iget-object v0, p0, Lcg/u;->a:LM3/q;

    .line 29
    .line 30
    invoke-virtual {v0}, LM3/q;->i()V

    .line 31
    .line 32
    .line 33
    throw p1
.end method

.method public e(Ljava/lang/Boolean;)Ljava/util/List;
    .locals 14

    .line 1
    const-string v0, "SELECT * FROM work_data WHERE with_alarm_manager = ?"

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-static {v0, v1}, LM3/t;->g(Ljava/lang/String;I)LM3/t;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    const/4 v2, 0x0

    .line 9
    if-nez p1, :cond_0

    .line 10
    .line 11
    move-object p1, v2

    .line 12
    goto :goto_0

    .line 13
    :cond_0
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    :goto_0
    if-nez p1, :cond_1

    .line 22
    .line 23
    invoke-virtual {v0, v1}, LM3/t;->I1(I)V

    .line 24
    .line 25
    .line 26
    goto :goto_1

    .line 27
    :cond_1
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 28
    .line 29
    .line 30
    move-result p1

    .line 31
    int-to-long v3, p1

    .line 32
    invoke-virtual {v0, v1, v3, v4}, LM3/t;->m1(IJ)V

    .line 33
    .line 34
    .line 35
    :goto_1
    iget-object p1, p0, Lcg/u;->a:LM3/q;

    .line 36
    .line 37
    invoke-virtual {p1}, LM3/q;->d()V

    .line 38
    .line 39
    .line 40
    iget-object p1, p0, Lcg/u;->a:LM3/q;

    .line 41
    .line 42
    const/4 v3, 0x0

    .line 43
    invoke-static {p1, v0, v3, v2}, LO3/b;->b(LM3/q;LS3/j;ZLandroid/os/CancellationSignal;)Landroid/database/Cursor;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    :try_start_0
    const-string v4, "id"

    .line 48
    .line 49
    invoke-static {p1, v4}, LO3/a;->e(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 50
    .line 51
    .line 52
    move-result v4

    .line 53
    const-string v5, "notification"

    .line 54
    .line 55
    invoke-static {p1, v5}, LO3/a;->e(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 56
    .line 57
    .line 58
    move-result v5

    .line 59
    const-string v6, "trigger"

    .line 60
    .line 61
    invoke-static {p1, v6}, LO3/a;->e(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 62
    .line 63
    .line 64
    move-result v6

    .line 65
    const-string v7, "with_alarm_manager"

    .line 66
    .line 67
    invoke-static {p1, v7}, LO3/a;->e(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 68
    .line 69
    .line 70
    move-result v7

    .line 71
    new-instance v8, Ljava/util/ArrayList;

    .line 72
    .line 73
    invoke-interface {p1}, Landroid/database/Cursor;->getCount()I

    .line 74
    .line 75
    .line 76
    move-result v9

    .line 77
    invoke-direct {v8, v9}, Ljava/util/ArrayList;-><init>(I)V

    .line 78
    .line 79
    .line 80
    :goto_2
    invoke-interface {p1}, Landroid/database/Cursor;->moveToNext()Z

    .line 81
    .line 82
    .line 83
    move-result v9

    .line 84
    if-eqz v9, :cond_8

    .line 85
    .line 86
    invoke-interface {p1, v4}, Landroid/database/Cursor;->isNull(I)Z

    .line 87
    .line 88
    .line 89
    move-result v9

    .line 90
    if-eqz v9, :cond_2

    .line 91
    .line 92
    move-object v9, v2

    .line 93
    goto :goto_3

    .line 94
    :cond_2
    invoke-interface {p1, v4}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 95
    .line 96
    .line 97
    move-result-object v9

    .line 98
    :goto_3
    invoke-interface {p1, v5}, Landroid/database/Cursor;->isNull(I)Z

    .line 99
    .line 100
    .line 101
    move-result v10

    .line 102
    if-eqz v10, :cond_3

    .line 103
    .line 104
    move-object v10, v2

    .line 105
    goto :goto_4

    .line 106
    :cond_3
    invoke-interface {p1, v5}, Landroid/database/Cursor;->getBlob(I)[B

    .line 107
    .line 108
    .line 109
    move-result-object v10

    .line 110
    :goto_4
    invoke-interface {p1, v6}, Landroid/database/Cursor;->isNull(I)Z

    .line 111
    .line 112
    .line 113
    move-result v11

    .line 114
    if-eqz v11, :cond_4

    .line 115
    .line 116
    move-object v11, v2

    .line 117
    goto :goto_5

    .line 118
    :cond_4
    invoke-interface {p1, v6}, Landroid/database/Cursor;->getBlob(I)[B

    .line 119
    .line 120
    .line 121
    move-result-object v11

    .line 122
    :goto_5
    invoke-interface {p1, v7}, Landroid/database/Cursor;->isNull(I)Z

    .line 123
    .line 124
    .line 125
    move-result v12

    .line 126
    if-eqz v12, :cond_5

    .line 127
    .line 128
    move-object v12, v2

    .line 129
    goto :goto_6

    .line 130
    :cond_5
    invoke-interface {p1, v7}, Landroid/database/Cursor;->getInt(I)I

    .line 131
    .line 132
    .line 133
    move-result v12

    .line 134
    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 135
    .line 136
    .line 137
    move-result-object v12

    .line 138
    :goto_6
    if-nez v12, :cond_6

    .line 139
    .line 140
    move-object v12, v2

    .line 141
    goto :goto_8

    .line 142
    :cond_6
    invoke-virtual {v12}, Ljava/lang/Integer;->intValue()I

    .line 143
    .line 144
    .line 145
    move-result v12

    .line 146
    if-eqz v12, :cond_7

    .line 147
    .line 148
    move v12, v1

    .line 149
    goto :goto_7

    .line 150
    :cond_7
    move v12, v3

    .line 151
    :goto_7
    invoke-static {v12}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 152
    .line 153
    .line 154
    move-result-object v12

    .line 155
    :goto_8
    new-instance v13, Lcg/v;

    .line 156
    .line 157
    invoke-direct {v13, v9, v10, v11, v12}, Lcg/v;-><init>(Ljava/lang/String;[B[BLjava/lang/Boolean;)V

    .line 158
    .line 159
    .line 160
    invoke-virtual {v8, v13}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 161
    .line 162
    .line 163
    goto :goto_2

    .line 164
    :catchall_0
    move-exception v1

    .line 165
    goto :goto_9

    .line 166
    :cond_8
    invoke-interface {p1}, Landroid/database/Cursor;->close()V

    .line 167
    .line 168
    .line 169
    invoke-virtual {v0}, LM3/t;->k()V

    .line 170
    .line 171
    .line 172
    return-object v8

    .line 173
    :goto_9
    invoke-interface {p1}, Landroid/database/Cursor;->close()V

    .line 174
    .line 175
    .line 176
    invoke-virtual {v0}, LM3/t;->k()V

    .line 177
    .line 178
    .line 179
    throw v1
.end method
