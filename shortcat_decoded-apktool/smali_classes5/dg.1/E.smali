.class public final Ldg/E;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Ljava/io/Closeable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ldg/E$a;
    }
.end annotation


# instance fields
.field private final a:Ldg/C;

.field private final b:Ldg/B;

.field private final c:Ljava/lang/String;

.field private final d:I

.field private final e:Ldg/s;

.field private final f:Ldg/t;

.field private final g:Ldg/F;

.field private final h:Ldg/E;

.field private final i:Ldg/E;

.field private final j:Ldg/E;

.field private final k:J

.field private final l:J

.field private final m:Ljg/c;

.field private n:Ldg/d;


# direct methods
.method public constructor <init>(Ldg/C;Ldg/B;Ljava/lang/String;ILdg/s;Ldg/t;Ldg/F;Ldg/E;Ldg/E;Ldg/E;JJLjg/c;)V
    .locals 1

    .line 1
    const-string v0, "request"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "protocol"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "message"

    .line 12
    .line 13
    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const-string v0, "headers"

    .line 17
    .line 18
    invoke-static {p6, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 22
    .line 23
    .line 24
    iput-object p1, p0, Ldg/E;->a:Ldg/C;

    .line 25
    .line 26
    iput-object p2, p0, Ldg/E;->b:Ldg/B;

    .line 27
    .line 28
    iput-object p3, p0, Ldg/E;->c:Ljava/lang/String;

    .line 29
    .line 30
    iput p4, p0, Ldg/E;->d:I

    .line 31
    .line 32
    iput-object p5, p0, Ldg/E;->e:Ldg/s;

    .line 33
    .line 34
    iput-object p6, p0, Ldg/E;->f:Ldg/t;

    .line 35
    .line 36
    iput-object p7, p0, Ldg/E;->g:Ldg/F;

    .line 37
    .line 38
    iput-object p8, p0, Ldg/E;->h:Ldg/E;

    .line 39
    .line 40
    iput-object p9, p0, Ldg/E;->i:Ldg/E;

    .line 41
    .line 42
    iput-object p10, p0, Ldg/E;->j:Ldg/E;

    .line 43
    .line 44
    iput-wide p11, p0, Ldg/E;->k:J

    .line 45
    .line 46
    iput-wide p13, p0, Ldg/E;->l:J

    .line 47
    .line 48
    move-object/from16 p1, p15

    .line 49
    .line 50
    iput-object p1, p0, Ldg/E;->m:Ljg/c;

    .line 51
    .line 52
    return-void
.end method

.method public static synthetic D(Ldg/E;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Ljava/lang/String;
    .locals 0

    .line 1
    and-int/lit8 p3, p3, 0x2

    .line 2
    .line 3
    if-eqz p3, :cond_0

    .line 4
    .line 5
    const/4 p2, 0x0

    .line 6
    :cond_0
    invoke-virtual {p0, p1, p2}, Ldg/E;->C(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0
.end method


# virtual methods
.method public final B0()J
    .locals 2

    .line 1
    iget-wide v0, p0, Ldg/E;->l:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public final C(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "name"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Ldg/E;->f:Ldg/t;

    .line 7
    .line 8
    invoke-virtual {v0, p1}, Ldg/t;->d(Ljava/lang/String;)Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    if-nez p1, :cond_0

    .line 13
    .line 14
    return-object p2

    .line 15
    :cond_0
    return-object p1
.end method

.method public final E()Ldg/t;
    .locals 1

    .line 1
    iget-object v0, p0, Ldg/E;->f:Ldg/t;

    .line 2
    .line 3
    return-object v0
.end method

.method public final F0()Ldg/C;
    .locals 1

    .line 1
    iget-object v0, p0, Ldg/E;->a:Ldg/C;

    .line 2
    .line 3
    return-object v0
.end method

.method public final G0()J
    .locals 2

    .line 1
    iget-wide v0, p0, Ldg/E;->k:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public final H()Z
    .locals 2

    .line 1
    iget v0, p0, Ldg/E;->d:I

    .line 2
    .line 3
    const/16 v1, 0x133

    .line 4
    .line 5
    if-eq v0, v1, :cond_0

    .line 6
    .line 7
    const/16 v1, 0x134

    .line 8
    .line 9
    if-eq v0, v1, :cond_0

    .line 10
    .line 11
    packed-switch v0, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    const/4 v0, 0x0

    .line 15
    return v0

    .line 16
    :cond_0
    :pswitch_0
    const/4 v0, 0x1

    .line 17
    return v0

    .line 18
    nop

    .line 19
    :pswitch_data_0
    .packed-switch 0x12c
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method public final J()Z
    .locals 3

    .line 1
    iget v0, p0, Ldg/E;->d:I

    .line 2
    .line 3
    const/16 v1, 0xc8

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    if-gt v1, v0, :cond_0

    .line 7
    .line 8
    const/16 v1, 0x12c

    .line 9
    .line 10
    if-ge v0, v1, :cond_0

    .line 11
    .line 12
    const/4 v0, 0x1

    .line 13
    return v0

    .line 14
    :cond_0
    return v2
.end method

.method public final O()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Ldg/E;->c:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final S()Ldg/E;
    .locals 1

    .line 1
    iget-object v0, p0, Ldg/E;->h:Ldg/E;

    .line 2
    .line 3
    return-object v0
.end method

.method public final Y()Ldg/E$a;
    .locals 1

    .line 1
    new-instance v0, Ldg/E$a;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Ldg/E$a;-><init>(Ldg/E;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public final a()Ldg/F;
    .locals 1

    .line 1
    iget-object v0, p0, Ldg/E;->g:Ldg/F;

    .line 2
    .line 3
    return-object v0
.end method

.method public final b()I
    .locals 1

    .line 1
    iget v0, p0, Ldg/E;->d:I

    .line 2
    .line 3
    return v0
.end method

.method public close()V
    .locals 2

    .line 1
    iget-object v0, p0, Ldg/E;->g:Ldg/F;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Ldg/F;->close()V

    .line 6
    .line 7
    .line 8
    return-void

    .line 9
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 10
    .line 11
    const-string v1, "response is not eligible for a body and must not be closed"

    .line 12
    .line 13
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    throw v0
.end method

.method public final g()Ldg/t;
    .locals 1

    .line 1
    iget-object v0, p0, Ldg/E;->f:Ldg/t;

    .line 2
    .line 3
    return-object v0
.end method

.method public final h()Ldg/C;
    .locals 1

    .line 1
    iget-object v0, p0, Ldg/E;->a:Ldg/C;

    .line 2
    .line 3
    return-object v0
.end method

.method public final h0(J)Ldg/F;
    .locals 4

    .line 1
    iget-object v0, p0, Ldg/E;->g:Ldg/F;

    .line 2
    .line 3
    invoke-static {v0}, Lkotlin/jvm/internal/s;->e(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0}, Ldg/F;->k()Ltg/j;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-interface {v0}, Ltg/j;->peek()Ltg/j;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    new-instance v1, Ltg/h;

    .line 15
    .line 16
    invoke-direct {v1}, Ltg/h;-><init>()V

    .line 17
    .line 18
    .line 19
    invoke-interface {v0, p1, p2}, Ltg/j;->y0(J)Z

    .line 20
    .line 21
    .line 22
    invoke-interface {v0}, Ltg/j;->s()Ltg/h;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    invoke-virtual {v2}, Ltg/h;->size()J

    .line 27
    .line 28
    .line 29
    move-result-wide v2

    .line 30
    invoke-static {p1, p2, v2, v3}, Ljava/lang/Math;->min(JJ)J

    .line 31
    .line 32
    .line 33
    move-result-wide p1

    .line 34
    invoke-virtual {v1, v0, p1, p2}, Ltg/h;->S1(Ltg/Z;J)Ltg/h;

    .line 35
    .line 36
    .line 37
    sget-object p1, Ldg/F;->a:Ldg/F$a;

    .line 38
    .line 39
    iget-object p2, p0, Ldg/E;->g:Ldg/F;

    .line 40
    .line 41
    invoke-virtual {p2}, Ldg/F;->j()Ldg/x;

    .line 42
    .line 43
    .line 44
    move-result-object p2

    .line 45
    invoke-virtual {v1}, Ltg/h;->size()J

    .line 46
    .line 47
    .line 48
    move-result-wide v2

    .line 49
    invoke-virtual {p1, v1, p2, v2, v3}, Ldg/F$a;->c(Ltg/j;Ldg/x;J)Ldg/F;

    .line 50
    .line 51
    .line 52
    move-result-object p1

    .line 53
    return-object p1
.end method

.method public final j()Ldg/F;
    .locals 1

    .line 1
    iget-object v0, p0, Ldg/E;->g:Ldg/F;

    .line 2
    .line 3
    return-object v0
.end method

.method public final k()Ldg/d;
    .locals 2

    .line 1
    iget-object v0, p0, Ldg/E;->n:Ldg/d;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    sget-object v0, Ldg/d;->n:Ldg/d$b;

    .line 6
    .line 7
    iget-object v1, p0, Ldg/E;->f:Ldg/t;

    .line 8
    .line 9
    invoke-virtual {v0, v1}, Ldg/d$b;->b(Ldg/t;)Ldg/d;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    iput-object v0, p0, Ldg/E;->n:Ldg/d;

    .line 14
    .line 15
    :cond_0
    return-object v0
.end method

.method public final k0()Ldg/E;
    .locals 1

    .line 1
    iget-object v0, p0, Ldg/E;->j:Ldg/E;

    .line 2
    .line 3
    return-object v0
.end method

.method public final l()Ldg/E;
    .locals 1

    .line 1
    iget-object v0, p0, Ldg/E;->i:Ldg/E;

    .line 2
    .line 3
    return-object v0
.end method

.method public final m()Ljava/util/List;
    .locals 3

    .line 1
    iget-object v0, p0, Ldg/E;->f:Ldg/t;

    .line 2
    .line 3
    iget v1, p0, Ldg/E;->d:I

    .line 4
    .line 5
    const/16 v2, 0x191

    .line 6
    .line 7
    if-eq v1, v2, :cond_1

    .line 8
    .line 9
    const/16 v2, 0x197

    .line 10
    .line 11
    if-eq v1, v2, :cond_0

    .line 12
    .line 13
    invoke-static {}, LUd/u;->m()Ljava/util/List;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    return-object v0

    .line 18
    :cond_0
    const-string v1, "Proxy-Authenticate"

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_1
    const-string v1, "WWW-Authenticate"

    .line 22
    .line 23
    :goto_0
    invoke-static {v0, v1}, Lkg/e;->a(Ldg/t;Ljava/lang/String;)Ljava/util/List;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    return-object v0
.end method

.method public final o()I
    .locals 1

    .line 1
    iget v0, p0, Ldg/E;->d:I

    .line 2
    .line 3
    return v0
.end method

.method public final p0()Ldg/B;
    .locals 1

    .line 1
    iget-object v0, p0, Ldg/E;->b:Ldg/B;

    .line 2
    .line 3
    return-object v0
.end method

.method public final q()Ljg/c;
    .locals 1

    .line 1
    iget-object v0, p0, Ldg/E;->m:Ljg/c;

    .line 2
    .line 3
    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    const-string v1, "Response{protocol="

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    iget-object v1, p0, Ldg/E;->b:Ldg/B;

    .line 12
    .line 13
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 14
    .line 15
    .line 16
    const-string v1, ", code="

    .line 17
    .line 18
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    .line 21
    iget v1, p0, Ldg/E;->d:I

    .line 22
    .line 23
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    const-string v1, ", message="

    .line 27
    .line 28
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    iget-object v1, p0, Ldg/E;->c:Ljava/lang/String;

    .line 32
    .line 33
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    const-string v1, ", url="

    .line 37
    .line 38
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    iget-object v1, p0, Ldg/E;->a:Ldg/C;

    .line 42
    .line 43
    invoke-virtual {v1}, Ldg/C;->p()Ldg/u;

    .line 44
    .line 45
    .line 46
    move-result-object v1

    .line 47
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    .line 50
    const/16 v1, 0x7d

    .line 51
    .line 52
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 53
    .line 54
    .line 55
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    return-object v0
.end method

.method public final w()Ldg/s;
    .locals 1

    .line 1
    iget-object v0, p0, Ldg/E;->e:Ldg/s;

    .line 2
    .line 3
    return-object v0
.end method

.method public final z(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 1
    const-string v0, "name"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    const/4 v1, 0x2

    .line 8
    invoke-static {p0, p1, v0, v1, v0}, Ldg/E;->D(Ldg/E;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    return-object p1
.end method
