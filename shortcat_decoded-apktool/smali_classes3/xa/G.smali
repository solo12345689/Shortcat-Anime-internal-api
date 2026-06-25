.class final Lxa/G;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lxa/S;


# static fields
.field private static final r:[I

.field private static final s:Lsun/misc/Unsafe;


# instance fields
.field private final a:[I

.field private final b:[Ljava/lang/Object;

.field private final c:I

.field private final d:I

.field private final e:Lxa/D;

.field private final f:Z

.field private final g:Z

.field private final h:Lxa/M;

.field private final i:Z

.field private final j:[I

.field private final k:I

.field private final l:I

.field private final m:Lxa/I;

.field private final n:Lxa/u;

.field private final o:Lxa/Y;

.field private final p:Lxa/k;

.field private final q:Lxa/y;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    new-array v0, v0, [I

    .line 3
    .line 4
    sput-object v0, Lxa/G;->r:[I

    .line 5
    .line 6
    invoke-static {}, Lxa/c0;->B()Lsun/misc/Unsafe;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    sput-object v0, Lxa/G;->s:Lsun/misc/Unsafe;

    .line 11
    .line 12
    return-void
.end method

.method private constructor <init>([I[Ljava/lang/Object;IILxa/D;Lxa/M;Z[IIILxa/I;Lxa/u;Lxa/Y;Lxa/k;Lxa/y;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lxa/G;->a:[I

    .line 5
    .line 6
    iput-object p2, p0, Lxa/G;->b:[Ljava/lang/Object;

    .line 7
    .line 8
    iput p3, p0, Lxa/G;->c:I

    .line 9
    .line 10
    iput p4, p0, Lxa/G;->d:I

    .line 11
    .line 12
    instance-of p1, p5, Lxa/p;

    .line 13
    .line 14
    iput-boolean p1, p0, Lxa/G;->g:Z

    .line 15
    .line 16
    iput-object p6, p0, Lxa/G;->h:Lxa/M;

    .line 17
    .line 18
    if-eqz p14, :cond_0

    .line 19
    .line 20
    invoke-virtual {p14, p5}, Lxa/k;->d(Lxa/D;)Z

    .line 21
    .line 22
    .line 23
    move-result p1

    .line 24
    if-eqz p1, :cond_0

    .line 25
    .line 26
    const/4 p1, 0x1

    .line 27
    goto :goto_0

    .line 28
    :cond_0
    const/4 p1, 0x0

    .line 29
    :goto_0
    iput-boolean p1, p0, Lxa/G;->f:Z

    .line 30
    .line 31
    iput-boolean p7, p0, Lxa/G;->i:Z

    .line 32
    .line 33
    iput-object p8, p0, Lxa/G;->j:[I

    .line 34
    .line 35
    iput p9, p0, Lxa/G;->k:I

    .line 36
    .line 37
    iput p10, p0, Lxa/G;->l:I

    .line 38
    .line 39
    iput-object p11, p0, Lxa/G;->m:Lxa/I;

    .line 40
    .line 41
    iput-object p12, p0, Lxa/G;->n:Lxa/u;

    .line 42
    .line 43
    iput-object p13, p0, Lxa/G;->o:Lxa/Y;

    .line 44
    .line 45
    iput-object p14, p0, Lxa/G;->p:Lxa/k;

    .line 46
    .line 47
    iput-object p5, p0, Lxa/G;->e:Lxa/D;

    .line 48
    .line 49
    move-object p1, p15

    .line 50
    iput-object p1, p0, Lxa/G;->q:Lxa/y;

    .line 51
    .line 52
    return-void
.end method

.method private A(Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 5

    .line 1
    invoke-direct {p0, p2, p3}, Lxa/G;->p(Ljava/lang/Object;I)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    invoke-direct {p0, p3}, Lxa/G;->c0(I)I

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    invoke-static {v0}, Lxa/G;->J(I)J

    .line 13
    .line 14
    .line 15
    move-result-wide v0

    .line 16
    sget-object v2, Lxa/G;->s:Lsun/misc/Unsafe;

    .line 17
    .line 18
    invoke-virtual {v2, p2, v0, v1}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v3

    .line 22
    if-eqz v3, :cond_4

    .line 23
    .line 24
    invoke-direct {p0, p3}, Lxa/G;->n(I)Lxa/S;

    .line 25
    .line 26
    .line 27
    move-result-object p2

    .line 28
    invoke-direct {p0, p1, p3}, Lxa/G;->p(Ljava/lang/Object;I)Z

    .line 29
    .line 30
    .line 31
    move-result v4

    .line 32
    if-nez v4, :cond_2

    .line 33
    .line 34
    invoke-static {v3}, Lxa/G;->u(Ljava/lang/Object;)Z

    .line 35
    .line 36
    .line 37
    move-result v4

    .line 38
    if-nez v4, :cond_1

    .line 39
    .line 40
    invoke-virtual {v2, p1, v0, v1, v3}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 41
    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_1
    invoke-interface {p2}, Lxa/S;->b()Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object v4

    .line 48
    invoke-interface {p2, v4, v3}, Lxa/S;->a(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 49
    .line 50
    .line 51
    invoke-virtual {v2, p1, v0, v1, v4}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 52
    .line 53
    .line 54
    :goto_0
    invoke-direct {p0, p1, p3}, Lxa/G;->W(Ljava/lang/Object;I)V

    .line 55
    .line 56
    .line 57
    return-void

    .line 58
    :cond_2
    invoke-virtual {v2, p1, v0, v1}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object p3

    .line 62
    invoke-static {p3}, Lxa/G;->u(Ljava/lang/Object;)Z

    .line 63
    .line 64
    .line 65
    move-result v4

    .line 66
    if-nez v4, :cond_3

    .line 67
    .line 68
    invoke-interface {p2}, Lxa/S;->b()Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object v4

    .line 72
    invoke-interface {p2, v4, p3}, Lxa/S;->a(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 73
    .line 74
    .line 75
    invoke-virtual {v2, p1, v0, v1, v4}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 76
    .line 77
    .line 78
    move-object p3, v4

    .line 79
    :cond_3
    invoke-interface {p2, p3, v3}, Lxa/S;->a(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 80
    .line 81
    .line 82
    return-void

    .line 83
    :cond_4
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 84
    .line 85
    new-instance v0, Ljava/lang/StringBuilder;

    .line 86
    .line 87
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 88
    .line 89
    .line 90
    const-string v1, "Source subfield "

    .line 91
    .line 92
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 93
    .line 94
    .line 95
    invoke-direct {p0, p3}, Lxa/G;->I(I)I

    .line 96
    .line 97
    .line 98
    move-result p3

    .line 99
    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 100
    .line 101
    .line 102
    const-string p3, " is present but null: "

    .line 103
    .line 104
    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 105
    .line 106
    .line 107
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 108
    .line 109
    .line 110
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 111
    .line 112
    .line 113
    move-result-object p2

    .line 114
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 115
    .line 116
    .line 117
    throw p1
.end method

.method private B(Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 6

    .line 1
    invoke-direct {p0, p3}, Lxa/G;->I(I)I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-direct {p0, p2, v0, p3}, Lxa/G;->w(Ljava/lang/Object;II)Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-nez v1, :cond_0

    .line 10
    .line 11
    return-void

    .line 12
    :cond_0
    invoke-direct {p0, p3}, Lxa/G;->c0(I)I

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    invoke-static {v1}, Lxa/G;->J(I)J

    .line 17
    .line 18
    .line 19
    move-result-wide v1

    .line 20
    sget-object v3, Lxa/G;->s:Lsun/misc/Unsafe;

    .line 21
    .line 22
    invoke-virtual {v3, p2, v1, v2}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v4

    .line 26
    if-eqz v4, :cond_4

    .line 27
    .line 28
    invoke-direct {p0, p3}, Lxa/G;->n(I)Lxa/S;

    .line 29
    .line 30
    .line 31
    move-result-object p2

    .line 32
    invoke-direct {p0, p1, v0, p3}, Lxa/G;->w(Ljava/lang/Object;II)Z

    .line 33
    .line 34
    .line 35
    move-result v5

    .line 36
    if-nez v5, :cond_2

    .line 37
    .line 38
    invoke-static {v4}, Lxa/G;->u(Ljava/lang/Object;)Z

    .line 39
    .line 40
    .line 41
    move-result v5

    .line 42
    if-nez v5, :cond_1

    .line 43
    .line 44
    invoke-virtual {v3, p1, v1, v2, v4}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 45
    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_1
    invoke-interface {p2}, Lxa/S;->b()Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object v5

    .line 52
    invoke-interface {p2, v5, v4}, Lxa/S;->a(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 53
    .line 54
    .line 55
    invoke-virtual {v3, p1, v1, v2, v5}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 56
    .line 57
    .line 58
    :goto_0
    invoke-direct {p0, p1, v0, p3}, Lxa/G;->X(Ljava/lang/Object;II)V

    .line 59
    .line 60
    .line 61
    return-void

    .line 62
    :cond_2
    invoke-virtual {v3, p1, v1, v2}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object p3

    .line 66
    invoke-static {p3}, Lxa/G;->u(Ljava/lang/Object;)Z

    .line 67
    .line 68
    .line 69
    move-result v0

    .line 70
    if-nez v0, :cond_3

    .line 71
    .line 72
    invoke-interface {p2}, Lxa/S;->b()Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object v0

    .line 76
    invoke-interface {p2, v0, p3}, Lxa/S;->a(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 77
    .line 78
    .line 79
    invoke-virtual {v3, p1, v1, v2, v0}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 80
    .line 81
    .line 82
    move-object p3, v0

    .line 83
    :cond_3
    invoke-interface {p2, p3, v4}, Lxa/S;->a(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 84
    .line 85
    .line 86
    return-void

    .line 87
    :cond_4
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 88
    .line 89
    new-instance v0, Ljava/lang/StringBuilder;

    .line 90
    .line 91
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 92
    .line 93
    .line 94
    const-string v1, "Source subfield "

    .line 95
    .line 96
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 97
    .line 98
    .line 99
    invoke-direct {p0, p3}, Lxa/G;->I(I)I

    .line 100
    .line 101
    .line 102
    move-result p3

    .line 103
    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 104
    .line 105
    .line 106
    const-string p3, " is present but null: "

    .line 107
    .line 108
    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 109
    .line 110
    .line 111
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 112
    .line 113
    .line 114
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 115
    .line 116
    .line 117
    move-result-object p2

    .line 118
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 119
    .line 120
    .line 121
    throw p1
.end method

.method private C(Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 5

    .line 1
    invoke-direct {p0, p3}, Lxa/G;->c0(I)I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-static {v0}, Lxa/G;->J(I)J

    .line 6
    .line 7
    .line 8
    move-result-wide v1

    .line 9
    invoke-direct {p0, p3}, Lxa/G;->I(I)I

    .line 10
    .line 11
    .line 12
    move-result v3

    .line 13
    invoke-static {v0}, Lxa/G;->b0(I)I

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    packed-switch v0, :pswitch_data_0

    .line 18
    .line 19
    .line 20
    goto/16 :goto_0

    .line 21
    .line 22
    :pswitch_0
    invoke-direct {p0, p1, p2, p3}, Lxa/G;->B(Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 23
    .line 24
    .line 25
    return-void

    .line 26
    :pswitch_1
    invoke-direct {p0, p2, v3, p3}, Lxa/G;->w(Ljava/lang/Object;II)Z

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    if-eqz v0, :cond_0

    .line 31
    .line 32
    invoke-static {p2, v1, v2}, Lxa/c0;->A(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object p2

    .line 36
    invoke-static {p1, v1, v2, p2}, Lxa/c0;->O(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    invoke-direct {p0, p1, v3, p3}, Lxa/G;->X(Ljava/lang/Object;II)V

    .line 40
    .line 41
    .line 42
    return-void

    .line 43
    :pswitch_2
    invoke-direct {p0, p1, p2, p3}, Lxa/G;->B(Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 44
    .line 45
    .line 46
    return-void

    .line 47
    :pswitch_3
    invoke-direct {p0, p2, v3, p3}, Lxa/G;->w(Ljava/lang/Object;II)Z

    .line 48
    .line 49
    .line 50
    move-result v0

    .line 51
    if-eqz v0, :cond_0

    .line 52
    .line 53
    invoke-static {p2, v1, v2}, Lxa/c0;->A(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object p2

    .line 57
    invoke-static {p1, v1, v2, p2}, Lxa/c0;->O(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 58
    .line 59
    .line 60
    invoke-direct {p0, p1, v3, p3}, Lxa/G;->X(Ljava/lang/Object;II)V

    .line 61
    .line 62
    .line 63
    return-void

    .line 64
    :pswitch_4
    iget-object p3, p0, Lxa/G;->q:Lxa/y;

    .line 65
    .line 66
    invoke-static {p3, p1, p2, v1, v2}, Lxa/U;->f(Lxa/y;Ljava/lang/Object;Ljava/lang/Object;J)V

    .line 67
    .line 68
    .line 69
    return-void

    .line 70
    :pswitch_5
    iget-object p3, p0, Lxa/G;->n:Lxa/u;

    .line 71
    .line 72
    invoke-virtual {p3, p1, p2, v1, v2}, Lxa/u;->d(Ljava/lang/Object;Ljava/lang/Object;J)V

    .line 73
    .line 74
    .line 75
    return-void

    .line 76
    :pswitch_6
    invoke-direct {p0, p1, p2, p3}, Lxa/G;->A(Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 77
    .line 78
    .line 79
    return-void

    .line 80
    :pswitch_7
    invoke-direct {p0, p2, p3}, Lxa/G;->p(Ljava/lang/Object;I)Z

    .line 81
    .line 82
    .line 83
    move-result v0

    .line 84
    if-eqz v0, :cond_0

    .line 85
    .line 86
    invoke-static {p2, v1, v2}, Lxa/c0;->y(Ljava/lang/Object;J)J

    .line 87
    .line 88
    .line 89
    move-result-wide v3

    .line 90
    invoke-static {p1, v1, v2, v3, v4}, Lxa/c0;->N(Ljava/lang/Object;JJ)V

    .line 91
    .line 92
    .line 93
    invoke-direct {p0, p1, p3}, Lxa/G;->W(Ljava/lang/Object;I)V

    .line 94
    .line 95
    .line 96
    return-void

    .line 97
    :pswitch_8
    invoke-direct {p0, p2, p3}, Lxa/G;->p(Ljava/lang/Object;I)Z

    .line 98
    .line 99
    .line 100
    move-result v0

    .line 101
    if-eqz v0, :cond_0

    .line 102
    .line 103
    invoke-static {p2, v1, v2}, Lxa/c0;->x(Ljava/lang/Object;J)I

    .line 104
    .line 105
    .line 106
    move-result p2

    .line 107
    invoke-static {p1, v1, v2, p2}, Lxa/c0;->M(Ljava/lang/Object;JI)V

    .line 108
    .line 109
    .line 110
    invoke-direct {p0, p1, p3}, Lxa/G;->W(Ljava/lang/Object;I)V

    .line 111
    .line 112
    .line 113
    return-void

    .line 114
    :pswitch_9
    invoke-direct {p0, p2, p3}, Lxa/G;->p(Ljava/lang/Object;I)Z

    .line 115
    .line 116
    .line 117
    move-result v0

    .line 118
    if-eqz v0, :cond_0

    .line 119
    .line 120
    invoke-static {p2, v1, v2}, Lxa/c0;->y(Ljava/lang/Object;J)J

    .line 121
    .line 122
    .line 123
    move-result-wide v3

    .line 124
    invoke-static {p1, v1, v2, v3, v4}, Lxa/c0;->N(Ljava/lang/Object;JJ)V

    .line 125
    .line 126
    .line 127
    invoke-direct {p0, p1, p3}, Lxa/G;->W(Ljava/lang/Object;I)V

    .line 128
    .line 129
    .line 130
    return-void

    .line 131
    :pswitch_a
    invoke-direct {p0, p2, p3}, Lxa/G;->p(Ljava/lang/Object;I)Z

    .line 132
    .line 133
    .line 134
    move-result v0

    .line 135
    if-eqz v0, :cond_0

    .line 136
    .line 137
    invoke-static {p2, v1, v2}, Lxa/c0;->x(Ljava/lang/Object;J)I

    .line 138
    .line 139
    .line 140
    move-result p2

    .line 141
    invoke-static {p1, v1, v2, p2}, Lxa/c0;->M(Ljava/lang/Object;JI)V

    .line 142
    .line 143
    .line 144
    invoke-direct {p0, p1, p3}, Lxa/G;->W(Ljava/lang/Object;I)V

    .line 145
    .line 146
    .line 147
    return-void

    .line 148
    :pswitch_b
    invoke-direct {p0, p2, p3}, Lxa/G;->p(Ljava/lang/Object;I)Z

    .line 149
    .line 150
    .line 151
    move-result v0

    .line 152
    if-eqz v0, :cond_0

    .line 153
    .line 154
    invoke-static {p2, v1, v2}, Lxa/c0;->x(Ljava/lang/Object;J)I

    .line 155
    .line 156
    .line 157
    move-result p2

    .line 158
    invoke-static {p1, v1, v2, p2}, Lxa/c0;->M(Ljava/lang/Object;JI)V

    .line 159
    .line 160
    .line 161
    invoke-direct {p0, p1, p3}, Lxa/G;->W(Ljava/lang/Object;I)V

    .line 162
    .line 163
    .line 164
    return-void

    .line 165
    :pswitch_c
    invoke-direct {p0, p2, p3}, Lxa/G;->p(Ljava/lang/Object;I)Z

    .line 166
    .line 167
    .line 168
    move-result v0

    .line 169
    if-eqz v0, :cond_0

    .line 170
    .line 171
    invoke-static {p2, v1, v2}, Lxa/c0;->x(Ljava/lang/Object;J)I

    .line 172
    .line 173
    .line 174
    move-result p2

    .line 175
    invoke-static {p1, v1, v2, p2}, Lxa/c0;->M(Ljava/lang/Object;JI)V

    .line 176
    .line 177
    .line 178
    invoke-direct {p0, p1, p3}, Lxa/G;->W(Ljava/lang/Object;I)V

    .line 179
    .line 180
    .line 181
    return-void

    .line 182
    :pswitch_d
    invoke-direct {p0, p2, p3}, Lxa/G;->p(Ljava/lang/Object;I)Z

    .line 183
    .line 184
    .line 185
    move-result v0

    .line 186
    if-eqz v0, :cond_0

    .line 187
    .line 188
    invoke-static {p2, v1, v2}, Lxa/c0;->A(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 189
    .line 190
    .line 191
    move-result-object p2

    .line 192
    invoke-static {p1, v1, v2, p2}, Lxa/c0;->O(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 193
    .line 194
    .line 195
    invoke-direct {p0, p1, p3}, Lxa/G;->W(Ljava/lang/Object;I)V

    .line 196
    .line 197
    .line 198
    return-void

    .line 199
    :pswitch_e
    invoke-direct {p0, p1, p2, p3}, Lxa/G;->A(Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 200
    .line 201
    .line 202
    return-void

    .line 203
    :pswitch_f
    invoke-direct {p0, p2, p3}, Lxa/G;->p(Ljava/lang/Object;I)Z

    .line 204
    .line 205
    .line 206
    move-result v0

    .line 207
    if-eqz v0, :cond_0

    .line 208
    .line 209
    invoke-static {p2, v1, v2}, Lxa/c0;->A(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 210
    .line 211
    .line 212
    move-result-object p2

    .line 213
    invoke-static {p1, v1, v2, p2}, Lxa/c0;->O(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 214
    .line 215
    .line 216
    invoke-direct {p0, p1, p3}, Lxa/G;->W(Ljava/lang/Object;I)V

    .line 217
    .line 218
    .line 219
    return-void

    .line 220
    :pswitch_10
    invoke-direct {p0, p2, p3}, Lxa/G;->p(Ljava/lang/Object;I)Z

    .line 221
    .line 222
    .line 223
    move-result v0

    .line 224
    if-eqz v0, :cond_0

    .line 225
    .line 226
    invoke-static {p2, v1, v2}, Lxa/c0;->p(Ljava/lang/Object;J)Z

    .line 227
    .line 228
    .line 229
    move-result p2

    .line 230
    invoke-static {p1, v1, v2, p2}, Lxa/c0;->F(Ljava/lang/Object;JZ)V

    .line 231
    .line 232
    .line 233
    invoke-direct {p0, p1, p3}, Lxa/G;->W(Ljava/lang/Object;I)V

    .line 234
    .line 235
    .line 236
    return-void

    .line 237
    :pswitch_11
    invoke-direct {p0, p2, p3}, Lxa/G;->p(Ljava/lang/Object;I)Z

    .line 238
    .line 239
    .line 240
    move-result v0

    .line 241
    if-eqz v0, :cond_0

    .line 242
    .line 243
    invoke-static {p2, v1, v2}, Lxa/c0;->x(Ljava/lang/Object;J)I

    .line 244
    .line 245
    .line 246
    move-result p2

    .line 247
    invoke-static {p1, v1, v2, p2}, Lxa/c0;->M(Ljava/lang/Object;JI)V

    .line 248
    .line 249
    .line 250
    invoke-direct {p0, p1, p3}, Lxa/G;->W(Ljava/lang/Object;I)V

    .line 251
    .line 252
    .line 253
    return-void

    .line 254
    :pswitch_12
    invoke-direct {p0, p2, p3}, Lxa/G;->p(Ljava/lang/Object;I)Z

    .line 255
    .line 256
    .line 257
    move-result v0

    .line 258
    if-eqz v0, :cond_0

    .line 259
    .line 260
    invoke-static {p2, v1, v2}, Lxa/c0;->y(Ljava/lang/Object;J)J

    .line 261
    .line 262
    .line 263
    move-result-wide v3

    .line 264
    invoke-static {p1, v1, v2, v3, v4}, Lxa/c0;->N(Ljava/lang/Object;JJ)V

    .line 265
    .line 266
    .line 267
    invoke-direct {p0, p1, p3}, Lxa/G;->W(Ljava/lang/Object;I)V

    .line 268
    .line 269
    .line 270
    return-void

    .line 271
    :pswitch_13
    invoke-direct {p0, p2, p3}, Lxa/G;->p(Ljava/lang/Object;I)Z

    .line 272
    .line 273
    .line 274
    move-result v0

    .line 275
    if-eqz v0, :cond_0

    .line 276
    .line 277
    invoke-static {p2, v1, v2}, Lxa/c0;->x(Ljava/lang/Object;J)I

    .line 278
    .line 279
    .line 280
    move-result p2

    .line 281
    invoke-static {p1, v1, v2, p2}, Lxa/c0;->M(Ljava/lang/Object;JI)V

    .line 282
    .line 283
    .line 284
    invoke-direct {p0, p1, p3}, Lxa/G;->W(Ljava/lang/Object;I)V

    .line 285
    .line 286
    .line 287
    return-void

    .line 288
    :pswitch_14
    invoke-direct {p0, p2, p3}, Lxa/G;->p(Ljava/lang/Object;I)Z

    .line 289
    .line 290
    .line 291
    move-result v0

    .line 292
    if-eqz v0, :cond_0

    .line 293
    .line 294
    invoke-static {p2, v1, v2}, Lxa/c0;->y(Ljava/lang/Object;J)J

    .line 295
    .line 296
    .line 297
    move-result-wide v3

    .line 298
    invoke-static {p1, v1, v2, v3, v4}, Lxa/c0;->N(Ljava/lang/Object;JJ)V

    .line 299
    .line 300
    .line 301
    invoke-direct {p0, p1, p3}, Lxa/G;->W(Ljava/lang/Object;I)V

    .line 302
    .line 303
    .line 304
    return-void

    .line 305
    :pswitch_15
    invoke-direct {p0, p2, p3}, Lxa/G;->p(Ljava/lang/Object;I)Z

    .line 306
    .line 307
    .line 308
    move-result v0

    .line 309
    if-eqz v0, :cond_0

    .line 310
    .line 311
    invoke-static {p2, v1, v2}, Lxa/c0;->y(Ljava/lang/Object;J)J

    .line 312
    .line 313
    .line 314
    move-result-wide v3

    .line 315
    invoke-static {p1, v1, v2, v3, v4}, Lxa/c0;->N(Ljava/lang/Object;JJ)V

    .line 316
    .line 317
    .line 318
    invoke-direct {p0, p1, p3}, Lxa/G;->W(Ljava/lang/Object;I)V

    .line 319
    .line 320
    .line 321
    return-void

    .line 322
    :pswitch_16
    invoke-direct {p0, p2, p3}, Lxa/G;->p(Ljava/lang/Object;I)Z

    .line 323
    .line 324
    .line 325
    move-result v0

    .line 326
    if-eqz v0, :cond_0

    .line 327
    .line 328
    invoke-static {p2, v1, v2}, Lxa/c0;->w(Ljava/lang/Object;J)F

    .line 329
    .line 330
    .line 331
    move-result p2

    .line 332
    invoke-static {p1, v1, v2, p2}, Lxa/c0;->L(Ljava/lang/Object;JF)V

    .line 333
    .line 334
    .line 335
    invoke-direct {p0, p1, p3}, Lxa/G;->W(Ljava/lang/Object;I)V

    .line 336
    .line 337
    .line 338
    return-void

    .line 339
    :pswitch_17
    invoke-direct {p0, p2, p3}, Lxa/G;->p(Ljava/lang/Object;I)Z

    .line 340
    .line 341
    .line 342
    move-result v0

    .line 343
    if-eqz v0, :cond_0

    .line 344
    .line 345
    invoke-static {p2, v1, v2}, Lxa/c0;->v(Ljava/lang/Object;J)D

    .line 346
    .line 347
    .line 348
    move-result-wide v3

    .line 349
    invoke-static {p1, v1, v2, v3, v4}, Lxa/c0;->K(Ljava/lang/Object;JD)V

    .line 350
    .line 351
    .line 352
    invoke-direct {p0, p1, p3}, Lxa/G;->W(Ljava/lang/Object;I)V

    .line 353
    .line 354
    .line 355
    :cond_0
    :goto_0
    return-void

    .line 356
    nop

    .line 357
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method private D(Ljava/lang/Object;I)Ljava/lang/Object;
    .locals 3

    .line 1
    invoke-direct {p0, p2}, Lxa/G;->n(I)Lxa/S;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-direct {p0, p2}, Lxa/G;->c0(I)I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    invoke-static {v1}, Lxa/G;->J(I)J

    .line 10
    .line 11
    .line 12
    move-result-wide v1

    .line 13
    invoke-direct {p0, p1, p2}, Lxa/G;->p(Ljava/lang/Object;I)Z

    .line 14
    .line 15
    .line 16
    move-result p2

    .line 17
    if-nez p2, :cond_0

    .line 18
    .line 19
    invoke-interface {v0}, Lxa/S;->b()Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    return-object p1

    .line 24
    :cond_0
    sget-object p2, Lxa/G;->s:Lsun/misc/Unsafe;

    .line 25
    .line 26
    invoke-virtual {p2, p1, v1, v2}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    invoke-static {p1}, Lxa/G;->u(Ljava/lang/Object;)Z

    .line 31
    .line 32
    .line 33
    move-result p2

    .line 34
    if-eqz p2, :cond_1

    .line 35
    .line 36
    return-object p1

    .line 37
    :cond_1
    invoke-interface {v0}, Lxa/S;->b()Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object p2

    .line 41
    if-eqz p1, :cond_2

    .line 42
    .line 43
    invoke-interface {v0, p2, p1}, Lxa/S;->a(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 44
    .line 45
    .line 46
    :cond_2
    return-object p2
.end method

.method private E(Ljava/lang/Object;II)Ljava/lang/Object;
    .locals 3

    .line 1
    invoke-direct {p0, p3}, Lxa/G;->n(I)Lxa/S;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-direct {p0, p1, p2, p3}, Lxa/G;->w(Ljava/lang/Object;II)Z

    .line 6
    .line 7
    .line 8
    move-result p2

    .line 9
    if-nez p2, :cond_0

    .line 10
    .line 11
    invoke-interface {v0}, Lxa/S;->b()Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    return-object p1

    .line 16
    :cond_0
    sget-object p2, Lxa/G;->s:Lsun/misc/Unsafe;

    .line 17
    .line 18
    invoke-direct {p0, p3}, Lxa/G;->c0(I)I

    .line 19
    .line 20
    .line 21
    move-result p3

    .line 22
    invoke-static {p3}, Lxa/G;->J(I)J

    .line 23
    .line 24
    .line 25
    move-result-wide v1

    .line 26
    invoke-virtual {p2, p1, v1, v2}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    invoke-static {p1}, Lxa/G;->u(Ljava/lang/Object;)Z

    .line 31
    .line 32
    .line 33
    move-result p2

    .line 34
    if-eqz p2, :cond_1

    .line 35
    .line 36
    return-object p1

    .line 37
    :cond_1
    invoke-interface {v0}, Lxa/S;->b()Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object p2

    .line 41
    if-eqz p1, :cond_2

    .line 42
    .line 43
    invoke-interface {v0, p2, p1}, Lxa/S;->a(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 44
    .line 45
    .line 46
    :cond_2
    return-object p2
.end method

.method static F(Ljava/lang/Class;Lxa/B;Lxa/I;Lxa/u;Lxa/Y;Lxa/k;Lxa/y;)Lxa/G;
    .locals 0

    .line 1
    instance-of p0, p1, Lxa/P;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    check-cast p1, Lxa/P;

    .line 6
    .line 7
    invoke-static/range {p1 .. p6}, Lxa/G;->H(Lxa/P;Lxa/I;Lxa/u;Lxa/Y;Lxa/k;Lxa/y;)Lxa/G;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    return-object p0

    .line 12
    :cond_0
    invoke-static {p1}, Landroid/support/v4/media/session/b;->a(Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    const/4 p1, 0x0

    .line 16
    invoke-static/range {p1 .. p6}, Lxa/G;->G(Lxa/V;Lxa/I;Lxa/u;Lxa/Y;Lxa/k;Lxa/y;)Lxa/G;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    return-object p0
.end method

.method static G(Lxa/V;Lxa/I;Lxa/u;Lxa/Y;Lxa/k;Lxa/y;)Lxa/G;
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    throw p0
.end method

.method static H(Lxa/P;Lxa/I;Lxa/u;Lxa/Y;Lxa/k;Lxa/y;)Lxa/G;
    .locals 33

    .line 1
    invoke-virtual/range {p0 .. p0}, Lxa/P;->e()Ljava/lang/String;

    move-result-object v0

    .line 2
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v1

    const/4 v2, 0x0

    .line 3
    invoke-virtual {v0, v2}, Ljava/lang/String;->charAt(I)C

    move-result v3

    const v5, 0xd800

    if-lt v3, v5, :cond_0

    const/4 v3, 0x1

    :goto_0
    add-int/lit8 v6, v3, 0x1

    .line 4
    invoke-virtual {v0, v3}, Ljava/lang/String;->charAt(I)C

    move-result v3

    if-lt v3, v5, :cond_1

    move v3, v6

    goto :goto_0

    :cond_0
    const/4 v6, 0x1

    :cond_1
    add-int/lit8 v3, v6, 0x1

    .line 5
    invoke-virtual {v0, v6}, Ljava/lang/String;->charAt(I)C

    move-result v6

    if-lt v6, v5, :cond_3

    and-int/lit16 v6, v6, 0x1fff

    const/16 v8, 0xd

    :goto_1
    add-int/lit8 v9, v3, 0x1

    .line 6
    invoke-virtual {v0, v3}, Ljava/lang/String;->charAt(I)C

    move-result v3

    if-lt v3, v5, :cond_2

    and-int/lit16 v3, v3, 0x1fff

    shl-int/2addr v3, v8

    or-int/2addr v6, v3

    add-int/lit8 v8, v8, 0xd

    move v3, v9

    goto :goto_1

    :cond_2
    shl-int/2addr v3, v8

    or-int/2addr v6, v3

    move v3, v9

    :cond_3
    if-nez v6, :cond_4

    .line 7
    sget-object v6, Lxa/G;->r:[I

    move v8, v2

    move v10, v8

    move v11, v10

    move v12, v11

    move v15, v12

    move/from16 v17, v15

    move-object/from16 v16, v6

    move/from16 v6, v17

    goto/16 :goto_a

    :cond_4
    add-int/lit8 v6, v3, 0x1

    .line 8
    invoke-virtual {v0, v3}, Ljava/lang/String;->charAt(I)C

    move-result v3

    if-lt v3, v5, :cond_6

    and-int/lit16 v3, v3, 0x1fff

    const/16 v8, 0xd

    :goto_2
    add-int/lit8 v9, v6, 0x1

    .line 9
    invoke-virtual {v0, v6}, Ljava/lang/String;->charAt(I)C

    move-result v6

    if-lt v6, v5, :cond_5

    and-int/lit16 v6, v6, 0x1fff

    shl-int/2addr v6, v8

    or-int/2addr v3, v6

    add-int/lit8 v8, v8, 0xd

    move v6, v9

    goto :goto_2

    :cond_5
    shl-int/2addr v6, v8

    or-int/2addr v3, v6

    move v6, v9

    :cond_6
    add-int/lit8 v8, v6, 0x1

    .line 10
    invoke-virtual {v0, v6}, Ljava/lang/String;->charAt(I)C

    move-result v6

    if-lt v6, v5, :cond_8

    and-int/lit16 v6, v6, 0x1fff

    const/16 v9, 0xd

    :goto_3
    add-int/lit8 v10, v8, 0x1

    .line 11
    invoke-virtual {v0, v8}, Ljava/lang/String;->charAt(I)C

    move-result v8

    if-lt v8, v5, :cond_7

    and-int/lit16 v8, v8, 0x1fff

    shl-int/2addr v8, v9

    or-int/2addr v6, v8

    add-int/lit8 v9, v9, 0xd

    move v8, v10

    goto :goto_3

    :cond_7
    shl-int/2addr v8, v9

    or-int/2addr v6, v8

    move v8, v10

    :cond_8
    add-int/lit8 v9, v8, 0x1

    .line 12
    invoke-virtual {v0, v8}, Ljava/lang/String;->charAt(I)C

    move-result v8

    if-lt v8, v5, :cond_a

    and-int/lit16 v8, v8, 0x1fff

    const/16 v10, 0xd

    :goto_4
    add-int/lit8 v11, v9, 0x1

    .line 13
    invoke-virtual {v0, v9}, Ljava/lang/String;->charAt(I)C

    move-result v9

    if-lt v9, v5, :cond_9

    and-int/lit16 v9, v9, 0x1fff

    shl-int/2addr v9, v10

    or-int/2addr v8, v9

    add-int/lit8 v10, v10, 0xd

    move v9, v11

    goto :goto_4

    :cond_9
    shl-int/2addr v9, v10

    or-int/2addr v8, v9

    move v9, v11

    :cond_a
    add-int/lit8 v10, v9, 0x1

    .line 14
    invoke-virtual {v0, v9}, Ljava/lang/String;->charAt(I)C

    move-result v9

    if-lt v9, v5, :cond_c

    and-int/lit16 v9, v9, 0x1fff

    const/16 v11, 0xd

    :goto_5
    add-int/lit8 v12, v10, 0x1

    .line 15
    invoke-virtual {v0, v10}, Ljava/lang/String;->charAt(I)C

    move-result v10

    if-lt v10, v5, :cond_b

    and-int/lit16 v10, v10, 0x1fff

    shl-int/2addr v10, v11

    or-int/2addr v9, v10

    add-int/lit8 v11, v11, 0xd

    move v10, v12

    goto :goto_5

    :cond_b
    shl-int/2addr v10, v11

    or-int/2addr v9, v10

    move v10, v12

    :cond_c
    add-int/lit8 v11, v10, 0x1

    .line 16
    invoke-virtual {v0, v10}, Ljava/lang/String;->charAt(I)C

    move-result v10

    if-lt v10, v5, :cond_e

    and-int/lit16 v10, v10, 0x1fff

    const/16 v12, 0xd

    :goto_6
    add-int/lit8 v13, v11, 0x1

    .line 17
    invoke-virtual {v0, v11}, Ljava/lang/String;->charAt(I)C

    move-result v11

    if-lt v11, v5, :cond_d

    and-int/lit16 v11, v11, 0x1fff

    shl-int/2addr v11, v12

    or-int/2addr v10, v11

    add-int/lit8 v12, v12, 0xd

    move v11, v13

    goto :goto_6

    :cond_d
    shl-int/2addr v11, v12

    or-int/2addr v10, v11

    move v11, v13

    :cond_e
    add-int/lit8 v12, v11, 0x1

    .line 18
    invoke-virtual {v0, v11}, Ljava/lang/String;->charAt(I)C

    move-result v11

    if-lt v11, v5, :cond_10

    and-int/lit16 v11, v11, 0x1fff

    const/16 v13, 0xd

    :goto_7
    add-int/lit8 v14, v12, 0x1

    .line 19
    invoke-virtual {v0, v12}, Ljava/lang/String;->charAt(I)C

    move-result v12

    if-lt v12, v5, :cond_f

    and-int/lit16 v12, v12, 0x1fff

    shl-int/2addr v12, v13

    or-int/2addr v11, v12

    add-int/lit8 v13, v13, 0xd

    move v12, v14

    goto :goto_7

    :cond_f
    shl-int/2addr v12, v13

    or-int/2addr v11, v12

    move v12, v14

    :cond_10
    add-int/lit8 v13, v12, 0x1

    .line 20
    invoke-virtual {v0, v12}, Ljava/lang/String;->charAt(I)C

    move-result v12

    if-lt v12, v5, :cond_12

    and-int/lit16 v12, v12, 0x1fff

    const/16 v14, 0xd

    :goto_8
    add-int/lit8 v15, v13, 0x1

    .line 21
    invoke-virtual {v0, v13}, Ljava/lang/String;->charAt(I)C

    move-result v13

    if-lt v13, v5, :cond_11

    and-int/lit16 v13, v13, 0x1fff

    shl-int/2addr v13, v14

    or-int/2addr v12, v13

    add-int/lit8 v14, v14, 0xd

    move v13, v15

    goto :goto_8

    :cond_11
    shl-int/2addr v13, v14

    or-int/2addr v12, v13

    move v13, v15

    :cond_12
    add-int/lit8 v14, v13, 0x1

    .line 22
    invoke-virtual {v0, v13}, Ljava/lang/String;->charAt(I)C

    move-result v13

    if-lt v13, v5, :cond_14

    and-int/lit16 v13, v13, 0x1fff

    const/16 v15, 0xd

    :goto_9
    add-int/lit8 v16, v14, 0x1

    .line 23
    invoke-virtual {v0, v14}, Ljava/lang/String;->charAt(I)C

    move-result v14

    if-lt v14, v5, :cond_13

    and-int/lit16 v14, v14, 0x1fff

    shl-int/2addr v14, v15

    or-int/2addr v13, v14

    add-int/lit8 v15, v15, 0xd

    move/from16 v14, v16

    goto :goto_9

    :cond_13
    shl-int/2addr v14, v15

    or-int/2addr v13, v14

    move/from16 v14, v16

    :cond_14
    add-int v15, v13, v11

    add-int/2addr v15, v12

    .line 24
    new-array v12, v15, [I

    mul-int/lit8 v15, v3, 0x2

    add-int/2addr v15, v6

    move v6, v11

    move v11, v8

    move v8, v6

    move v6, v3

    move-object/from16 v16, v12

    move/from16 v17, v13

    move v3, v14

    move v12, v9

    .line 25
    :goto_a
    sget-object v9, Lxa/G;->s:Lsun/misc/Unsafe;

    .line 26
    invoke-virtual/range {p0 .. p0}, Lxa/P;->d()[Ljava/lang/Object;

    move-result-object v13

    .line 27
    invoke-virtual/range {p0 .. p0}, Lxa/P;->b()Lxa/D;

    move-result-object v14

    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v14

    mul-int/lit8 v2, v10, 0x3

    .line 28
    new-array v2, v2, [I

    mul-int/lit8 v10, v10, 0x2

    .line 29
    new-array v10, v10, [Ljava/lang/Object;

    add-int v8, v17, v8

    move/from16 v22, v8

    move/from16 v21, v17

    const/16 v19, 0x0

    const/16 v20, 0x0

    :goto_b
    if-ge v3, v1, :cond_35

    add-int/lit8 v23, v3, 0x1

    .line 30
    invoke-virtual {v0, v3}, Ljava/lang/String;->charAt(I)C

    move-result v3

    if-lt v3, v5, :cond_16

    and-int/lit16 v3, v3, 0x1fff

    move/from16 v4, v23

    const/16 v23, 0xd

    const/16 v24, 0x1

    :goto_c
    add-int/lit8 v25, v4, 0x1

    .line 31
    invoke-virtual {v0, v4}, Ljava/lang/String;->charAt(I)C

    move-result v4

    if-lt v4, v5, :cond_15

    and-int/lit16 v4, v4, 0x1fff

    shl-int v4, v4, v23

    or-int/2addr v3, v4

    add-int/lit8 v23, v23, 0xd

    move/from16 v4, v25

    goto :goto_c

    :cond_15
    shl-int v4, v4, v23

    or-int/2addr v3, v4

    move/from16 v4, v25

    goto :goto_d

    :cond_16
    const/16 v24, 0x1

    move/from16 v4, v23

    :goto_d
    add-int/lit8 v23, v4, 0x1

    .line 32
    invoke-virtual {v0, v4}, Ljava/lang/String;->charAt(I)C

    move-result v4

    if-lt v4, v5, :cond_18

    and-int/lit16 v4, v4, 0x1fff

    move/from16 v7, v23

    const/16 v23, 0xd

    :goto_e
    add-int/lit8 v26, v7, 0x1

    .line 33
    invoke-virtual {v0, v7}, Ljava/lang/String;->charAt(I)C

    move-result v7

    if-lt v7, v5, :cond_17

    and-int/lit16 v7, v7, 0x1fff

    shl-int v7, v7, v23

    or-int/2addr v4, v7

    add-int/lit8 v23, v23, 0xd

    move/from16 v7, v26

    goto :goto_e

    :cond_17
    shl-int v7, v7, v23

    or-int/2addr v4, v7

    move/from16 v7, v26

    goto :goto_f

    :cond_18
    move/from16 v7, v23

    :goto_f
    and-int/lit16 v5, v4, 0xff

    move/from16 v26, v1

    and-int/lit16 v1, v4, 0x400

    if-eqz v1, :cond_19

    add-int/lit8 v1, v19, 0x1

    .line 34
    aput v20, v16, v19

    move/from16 v19, v1

    :cond_19
    const/16 v1, 0x33

    move-object/from16 v29, v2

    if-lt v5, v1, :cond_22

    add-int/lit8 v1, v7, 0x1

    .line 35
    invoke-virtual {v0, v7}, Ljava/lang/String;->charAt(I)C

    move-result v7

    const v2, 0xd800

    if-lt v7, v2, :cond_1b

    and-int/lit16 v7, v7, 0x1fff

    const/16 v31, 0xd

    :goto_10
    add-int/lit8 v32, v1, 0x1

    .line 36
    invoke-virtual {v0, v1}, Ljava/lang/String;->charAt(I)C

    move-result v1

    if-lt v1, v2, :cond_1a

    and-int/lit16 v1, v1, 0x1fff

    shl-int v1, v1, v31

    or-int/2addr v7, v1

    add-int/lit8 v31, v31, 0xd

    move/from16 v1, v32

    const v2, 0xd800

    goto :goto_10

    :cond_1a
    shl-int v1, v1, v31

    or-int/2addr v7, v1

    move/from16 v1, v32

    :cond_1b
    add-int/lit8 v2, v5, -0x33

    move/from16 v31, v1

    const/16 v1, 0x9

    if-eq v2, v1, :cond_1e

    const/16 v1, 0x11

    if-ne v2, v1, :cond_1c

    goto :goto_12

    :cond_1c
    const/16 v1, 0xc

    if-ne v2, v1, :cond_1f

    .line 37
    invoke-virtual/range {p0 .. p0}, Lxa/P;->c()Lxa/M;

    move-result-object v1

    sget-object v2, Lxa/M;->a:Lxa/M;

    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1d

    and-int/lit16 v1, v4, 0x800

    if-eqz v1, :cond_1f

    .line 38
    :cond_1d
    div-int/lit8 v1, v20, 0x3

    mul-int/lit8 v1, v1, 0x2

    add-int/lit8 v1, v1, 0x1

    add-int/lit8 v2, v15, 0x1

    aget-object v15, v13, v15

    aput-object v15, v10, v1

    :goto_11
    move v15, v2

    goto :goto_13

    .line 39
    :cond_1e
    :goto_12
    div-int/lit8 v1, v20, 0x3

    mul-int/lit8 v1, v1, 0x2

    add-int/lit8 v1, v1, 0x1

    add-int/lit8 v2, v15, 0x1

    aget-object v15, v13, v15

    aput-object v15, v10, v1

    goto :goto_11

    :cond_1f
    :goto_13
    mul-int/lit8 v7, v7, 0x2

    .line 40
    aget-object v1, v13, v7

    .line 41
    instance-of v2, v1, Ljava/lang/reflect/Field;

    if-eqz v2, :cond_20

    .line 42
    check-cast v1, Ljava/lang/reflect/Field;

    goto :goto_14

    .line 43
    :cond_20
    check-cast v1, Ljava/lang/String;

    invoke-static {v14, v1}, Lxa/G;->V(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v1

    .line 44
    aput-object v1, v13, v7

    .line 45
    :goto_14
    invoke-virtual {v9, v1}, Lsun/misc/Unsafe;->objectFieldOffset(Ljava/lang/reflect/Field;)J

    move-result-wide v1

    long-to-int v1, v1

    add-int/lit8 v7, v7, 0x1

    .line 46
    aget-object v2, v13, v7

    move/from16 v27, v1

    .line 47
    instance-of v1, v2, Ljava/lang/reflect/Field;

    if-eqz v1, :cond_21

    .line 48
    check-cast v2, Ljava/lang/reflect/Field;

    goto :goto_15

    .line 49
    :cond_21
    check-cast v2, Ljava/lang/String;

    invoke-static {v14, v2}, Lxa/G;->V(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v2

    .line 50
    aput-object v2, v13, v7

    .line 51
    :goto_15
    invoke-virtual {v9, v2}, Lsun/misc/Unsafe;->objectFieldOffset(Ljava/lang/reflect/Field;)J

    move-result-wide v1

    long-to-int v1, v1

    move-object/from16 v30, v0

    move v0, v1

    move/from16 v1, v27

    const/4 v7, 0x0

    move/from16 v27, v3

    move/from16 v3, v31

    goto/16 :goto_22

    :cond_22
    add-int/lit8 v1, v15, 0x1

    .line 52
    aget-object v2, v13, v15

    check-cast v2, Ljava/lang/String;

    invoke-static {v14, v2}, Lxa/G;->V(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v2

    move/from16 v31, v1

    const/16 v1, 0x9

    if-eq v5, v1, :cond_23

    const/16 v1, 0x11

    if-ne v5, v1, :cond_24

    :cond_23
    move/from16 v27, v3

    goto/16 :goto_19

    :cond_24
    const/16 v1, 0x1b

    if-eq v5, v1, :cond_25

    const/16 v1, 0x31

    if-ne v5, v1, :cond_26

    :cond_25
    move/from16 v27, v3

    goto :goto_18

    :cond_26
    const/16 v1, 0xc

    if-eq v5, v1, :cond_2a

    const/16 v1, 0x1e

    if-eq v5, v1, :cond_2a

    const/16 v1, 0x2c

    if-ne v5, v1, :cond_27

    goto :goto_16

    :cond_27
    const/16 v1, 0x32

    if-ne v5, v1, :cond_29

    add-int/lit8 v1, v21, 0x1

    .line 53
    aput v20, v16, v21

    .line 54
    div-int/lit8 v21, v20, 0x3

    mul-int/lit8 v21, v21, 0x2

    add-int/lit8 v27, v15, 0x2

    aget-object v28, v13, v31

    aput-object v28, v10, v21

    move/from16 v28, v1

    and-int/lit16 v1, v4, 0x800

    if-eqz v1, :cond_28

    add-int/lit8 v21, v21, 0x1

    add-int/lit8 v1, v15, 0x3

    .line 55
    aget-object v15, v13, v27

    aput-object v15, v10, v21

    move/from16 v27, v3

    move/from16 v21, v28

    goto :goto_1b

    :cond_28
    move/from16 v1, v27

    move/from16 v21, v28

    move/from16 v27, v3

    goto :goto_1b

    :cond_29
    move/from16 v27, v3

    goto :goto_1a

    .line 56
    :cond_2a
    :goto_16
    invoke-virtual/range {p0 .. p0}, Lxa/P;->c()Lxa/M;

    move-result-object v1

    move/from16 v27, v3

    sget-object v3, Lxa/M;->a:Lxa/M;

    if-eq v1, v3, :cond_2b

    and-int/lit16 v1, v4, 0x800

    if-eqz v1, :cond_2c

    .line 57
    :cond_2b
    div-int/lit8 v1, v20, 0x3

    mul-int/lit8 v1, v1, 0x2

    add-int/lit8 v1, v1, 0x1

    add-int/lit8 v15, v15, 0x2

    aget-object v3, v13, v31

    aput-object v3, v10, v1

    :goto_17
    move v1, v15

    goto :goto_1b

    .line 58
    :goto_18
    div-int/lit8 v1, v20, 0x3

    mul-int/lit8 v1, v1, 0x2

    add-int/lit8 v1, v1, 0x1

    add-int/lit8 v15, v15, 0x2

    aget-object v3, v13, v31

    aput-object v3, v10, v1

    goto :goto_17

    .line 59
    :goto_19
    div-int/lit8 v1, v20, 0x3

    mul-int/lit8 v1, v1, 0x2

    add-int/lit8 v1, v1, 0x1

    invoke-virtual {v2}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    move-result-object v3

    aput-object v3, v10, v1

    :cond_2c
    :goto_1a
    move/from16 v1, v31

    .line 60
    :goto_1b
    invoke-virtual {v9, v2}, Lsun/misc/Unsafe;->objectFieldOffset(Ljava/lang/reflect/Field;)J

    move-result-wide v2

    long-to-int v2, v2

    and-int/lit16 v3, v4, 0x1000

    if-eqz v3, :cond_30

    const/16 v3, 0x11

    if-gt v5, v3, :cond_30

    add-int/lit8 v3, v7, 0x1

    .line 61
    invoke-virtual {v0, v7}, Ljava/lang/String;->charAt(I)C

    move-result v7

    const v15, 0xd800

    if-lt v7, v15, :cond_2e

    and-int/lit16 v7, v7, 0x1fff

    const/16 v23, 0xd

    :goto_1c
    add-int/lit8 v28, v3, 0x1

    .line 62
    invoke-virtual {v0, v3}, Ljava/lang/String;->charAt(I)C

    move-result v3

    if-lt v3, v15, :cond_2d

    and-int/lit16 v3, v3, 0x1fff

    shl-int v3, v3, v23

    or-int/2addr v7, v3

    add-int/lit8 v23, v23, 0xd

    move/from16 v3, v28

    goto :goto_1c

    :cond_2d
    shl-int v3, v3, v23

    or-int/2addr v7, v3

    goto :goto_1d

    :cond_2e
    move/from16 v28, v3

    :goto_1d
    mul-int/lit8 v3, v6, 0x2

    .line 63
    div-int/lit8 v23, v7, 0x20

    add-int v3, v3, v23

    .line 64
    aget-object v15, v13, v3

    move-object/from16 v30, v0

    .line 65
    instance-of v0, v15, Ljava/lang/reflect/Field;

    if-eqz v0, :cond_2f

    .line 66
    check-cast v15, Ljava/lang/reflect/Field;

    :goto_1e
    move v3, v1

    goto :goto_1f

    .line 67
    :cond_2f
    check-cast v15, Ljava/lang/String;

    invoke-static {v14, v15}, Lxa/G;->V(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v15

    .line 68
    aput-object v15, v13, v3

    goto :goto_1e

    .line 69
    :goto_1f
    invoke-virtual {v9, v15}, Lsun/misc/Unsafe;->objectFieldOffset(Ljava/lang/reflect/Field;)J

    move-result-wide v0

    long-to-int v0, v0

    .line 70
    rem-int/lit8 v7, v7, 0x20

    :goto_20
    move v1, v0

    goto :goto_21

    :cond_30
    move-object/from16 v30, v0

    move v3, v1

    const v0, 0xfffff

    move/from16 v28, v7

    const/4 v7, 0x0

    goto :goto_20

    :goto_21
    const/16 v0, 0x12

    if-lt v5, v0, :cond_31

    const/16 v0, 0x31

    if-gt v5, v0, :cond_31

    add-int/lit8 v0, v22, 0x1

    .line 71
    aput v2, v16, v22

    move/from16 v22, v0

    :cond_31
    move v0, v1

    move v1, v2

    move v15, v3

    move/from16 v3, v28

    :goto_22
    add-int/lit8 v2, v20, 0x1

    .line 72
    aput v27, v29, v20

    add-int/lit8 v27, v20, 0x2

    move/from16 v28, v0

    and-int/lit16 v0, v4, 0x200

    if-eqz v0, :cond_32

    const/high16 v0, 0x20000000

    goto :goto_23

    :cond_32
    const/4 v0, 0x0

    :goto_23
    move/from16 v31, v0

    and-int/lit16 v0, v4, 0x100

    if-eqz v0, :cond_33

    const/high16 v0, 0x10000000

    goto :goto_24

    :cond_33
    const/4 v0, 0x0

    :goto_24
    or-int v0, v31, v0

    and-int/lit16 v4, v4, 0x800

    if-eqz v4, :cond_34

    const/high16 v4, -0x80000000

    goto :goto_25

    :cond_34
    const/4 v4, 0x0

    :goto_25
    or-int/2addr v0, v4

    shl-int/lit8 v4, v5, 0x14

    or-int/2addr v0, v4

    or-int/2addr v0, v1

    .line 73
    aput v0, v29, v2

    add-int/lit8 v20, v20, 0x3

    shl-int/lit8 v0, v7, 0x14

    or-int v0, v0, v28

    .line 74
    aput v0, v29, v27

    move/from16 v1, v26

    move-object/from16 v2, v29

    move-object/from16 v0, v30

    const v5, 0xd800

    goto/16 :goto_b

    :cond_35
    move-object/from16 v29, v2

    .line 75
    new-instance v0, Lxa/G;

    .line 76
    invoke-virtual/range {p0 .. p0}, Lxa/P;->b()Lxa/D;

    move-result-object v13

    .line 77
    invoke-virtual/range {p0 .. p0}, Lxa/P;->c()Lxa/M;

    move-result-object v14

    const/4 v15, 0x0

    move-object/from16 v19, p1

    move-object/from16 v20, p2

    move-object/from16 v21, p3

    move-object/from16 v22, p4

    move-object/from16 v23, p5

    move/from16 v18, v8

    move-object/from16 v9, v29

    move-object v8, v0

    invoke-direct/range {v8 .. v23}, Lxa/G;-><init>([I[Ljava/lang/Object;IILxa/D;Lxa/M;Z[IIILxa/I;Lxa/u;Lxa/Y;Lxa/k;Lxa/y;)V

    return-object v8
.end method

.method private I(I)I
    .locals 1

    .line 1
    iget-object v0, p0, Lxa/G;->a:[I

    .line 2
    .line 3
    aget p1, v0, p1

    .line 4
    .line 5
    return p1
.end method

.method private static J(I)J
    .locals 2

    .line 1
    const v0, 0xfffff

    .line 2
    .line 3
    .line 4
    and-int/2addr p0, v0

    .line 5
    int-to-long v0, p0

    .line 6
    return-wide v0
.end method

.method private static K(Ljava/lang/Object;J)Z
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lxa/c0;->A(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    check-cast p0, Ljava/lang/Boolean;

    .line 6
    .line 7
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    return p0
.end method

.method private static L(Ljava/lang/Object;J)D
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lxa/c0;->A(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    check-cast p0, Ljava/lang/Double;

    .line 6
    .line 7
    invoke-virtual {p0}, Ljava/lang/Double;->doubleValue()D

    .line 8
    .line 9
    .line 10
    move-result-wide p0

    .line 11
    return-wide p0
.end method

.method private static M(Ljava/lang/Object;J)F
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lxa/c0;->A(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    check-cast p0, Ljava/lang/Float;

    .line 6
    .line 7
    invoke-virtual {p0}, Ljava/lang/Float;->floatValue()F

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    return p0
.end method

.method private static N(Ljava/lang/Object;J)I
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lxa/c0;->A(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    check-cast p0, Ljava/lang/Integer;

    .line 6
    .line 7
    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    return p0
.end method

.method private static O(Ljava/lang/Object;J)J
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lxa/c0;->A(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    check-cast p0, Ljava/lang/Long;

    .line 6
    .line 7
    invoke-virtual {p0}, Ljava/lang/Long;->longValue()J

    .line 8
    .line 9
    .line 10
    move-result-wide p0

    .line 11
    return-wide p0
.end method

.method private P(I)I
    .locals 1

    .line 1
    iget v0, p0, Lxa/G;->c:I

    .line 2
    .line 3
    if-lt p1, v0, :cond_0

    .line 4
    .line 5
    iget v0, p0, Lxa/G;->d:I

    .line 6
    .line 7
    if-gt p1, v0, :cond_0

    .line 8
    .line 9
    const/4 v0, 0x0

    .line 10
    invoke-direct {p0, p1, v0}, Lxa/G;->Y(II)I

    .line 11
    .line 12
    .line 13
    move-result p1

    .line 14
    return p1

    .line 15
    :cond_0
    const/4 p1, -0x1

    .line 16
    return p1
.end method

.method private Q(I)I
    .locals 1

    .line 1
    iget-object v0, p0, Lxa/G;->a:[I

    .line 2
    .line 3
    add-int/lit8 p1, p1, 0x2

    .line 4
    .line 5
    aget p1, v0, p1

    .line 6
    .line 7
    return p1
.end method

.method private R(Ljava/lang/Object;JLxa/Q;Lxa/S;Lxa/j;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lxa/G;->n:Lxa/u;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2, p3}, Lxa/u;->e(Ljava/lang/Object;J)Ljava/util/List;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-interface {p4, p1, p5, p6}, Lxa/Q;->N(Ljava/util/List;Lxa/S;Lxa/j;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method private S(Ljava/lang/Object;ILxa/Q;Lxa/S;Lxa/j;)V
    .locals 2

    .line 1
    invoke-static {p2}, Lxa/G;->J(I)J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    iget-object p2, p0, Lxa/G;->n:Lxa/u;

    .line 6
    .line 7
    invoke-virtual {p2, p1, v0, v1}, Lxa/u;->e(Ljava/lang/Object;J)Ljava/util/List;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-interface {p3, p1, p4, p5}, Lxa/Q;->J(Ljava/util/List;Lxa/S;Lxa/j;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method private T(Ljava/lang/Object;ILxa/Q;)V
    .locals 2

    .line 1
    invoke-static {p2}, Lxa/G;->o(I)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-static {p2}, Lxa/G;->J(I)J

    .line 8
    .line 9
    .line 10
    move-result-wide v0

    .line 11
    invoke-interface {p3}, Lxa/Q;->I()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object p2

    .line 15
    invoke-static {p1, v0, v1, p2}, Lxa/c0;->O(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 16
    .line 17
    .line 18
    return-void

    .line 19
    :cond_0
    iget-boolean v0, p0, Lxa/G;->g:Z

    .line 20
    .line 21
    if-eqz v0, :cond_1

    .line 22
    .line 23
    invoke-static {p2}, Lxa/G;->J(I)J

    .line 24
    .line 25
    .line 26
    move-result-wide v0

    .line 27
    invoke-interface {p3}, Lxa/Q;->z()Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object p2

    .line 31
    invoke-static {p1, v0, v1, p2}, Lxa/c0;->O(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    return-void

    .line 35
    :cond_1
    invoke-static {p2}, Lxa/G;->J(I)J

    .line 36
    .line 37
    .line 38
    move-result-wide v0

    .line 39
    invoke-interface {p3}, Lxa/Q;->n()Lxa/e;

    .line 40
    .line 41
    .line 42
    move-result-object p2

    .line 43
    invoke-static {p1, v0, v1, p2}, Lxa/c0;->O(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 44
    .line 45
    .line 46
    return-void
.end method

.method private U(Ljava/lang/Object;ILxa/Q;)V
    .locals 3

    .line 1
    invoke-static {p2}, Lxa/G;->o(I)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget-object v0, p0, Lxa/G;->n:Lxa/u;

    .line 8
    .line 9
    invoke-static {p2}, Lxa/G;->J(I)J

    .line 10
    .line 11
    .line 12
    move-result-wide v1

    .line 13
    invoke-virtual {v0, p1, v1, v2}, Lxa/u;->e(Ljava/lang/Object;J)Ljava/util/List;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    invoke-interface {p3, p1}, Lxa/Q;->m(Ljava/util/List;)V

    .line 18
    .line 19
    .line 20
    return-void

    .line 21
    :cond_0
    iget-object v0, p0, Lxa/G;->n:Lxa/u;

    .line 22
    .line 23
    invoke-static {p2}, Lxa/G;->J(I)J

    .line 24
    .line 25
    .line 26
    move-result-wide v1

    .line 27
    invoke-virtual {v0, p1, v1, v2}, Lxa/u;->e(Ljava/lang/Object;J)Ljava/util/List;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    invoke-interface {p3, p1}, Lxa/Q;->B(Ljava/util/List;)V

    .line 32
    .line 33
    .line 34
    return-void
.end method

.method private static V(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Field;
    .locals 5

    .line 1
    :try_start_0
    invoke-virtual {p0, p1}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 2
    .line 3
    .line 4
    move-result-object p0
    :try_end_0
    .catch Ljava/lang/NoSuchFieldException; {:try_start_0 .. :try_end_0} :catch_0

    .line 5
    return-object p0

    .line 6
    :catch_0
    invoke-virtual {p0}, Ljava/lang/Class;->getDeclaredFields()[Ljava/lang/reflect/Field;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    array-length v1, v0

    .line 11
    const/4 v2, 0x0

    .line 12
    :goto_0
    if-ge v2, v1, :cond_1

    .line 13
    .line 14
    aget-object v3, v0, v2

    .line 15
    .line 16
    invoke-virtual {v3}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v4

    .line 20
    invoke-virtual {p1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 21
    .line 22
    .line 23
    move-result v4

    .line 24
    if-eqz v4, :cond_0

    .line 25
    .line 26
    return-object v3

    .line 27
    :cond_0
    add-int/lit8 v2, v2, 0x1

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_1
    new-instance v1, Ljava/lang/RuntimeException;

    .line 31
    .line 32
    new-instance v2, Ljava/lang/StringBuilder;

    .line 33
    .line 34
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 35
    .line 36
    .line 37
    const-string v3, "Field "

    .line 38
    .line 39
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    const-string p1, " for "

    .line 46
    .line 47
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    .line 50
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object p0

    .line 54
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 55
    .line 56
    .line 57
    const-string p0, " not found. Known fields are "

    .line 58
    .line 59
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 60
    .line 61
    .line 62
    invoke-static {v0}, Ljava/util/Arrays;->toString([Ljava/lang/Object;)Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object p0

    .line 66
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 67
    .line 68
    .line 69
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object p0

    .line 73
    invoke-direct {v1, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 74
    .line 75
    .line 76
    throw v1
.end method

.method private W(Ljava/lang/Object;I)V
    .locals 4

    .line 1
    invoke-direct {p0, p2}, Lxa/G;->Q(I)I

    .line 2
    .line 3
    .line 4
    move-result p2

    .line 5
    const v0, 0xfffff

    .line 6
    .line 7
    .line 8
    and-int/2addr v0, p2

    .line 9
    int-to-long v0, v0

    .line 10
    const-wide/32 v2, 0xfffff

    .line 11
    .line 12
    .line 13
    cmp-long v2, v0, v2

    .line 14
    .line 15
    if-nez v2, :cond_0

    .line 16
    .line 17
    return-void

    .line 18
    :cond_0
    ushr-int/lit8 p2, p2, 0x14

    .line 19
    .line 20
    const/4 v2, 0x1

    .line 21
    shl-int p2, v2, p2

    .line 22
    .line 23
    invoke-static {p1, v0, v1}, Lxa/c0;->x(Ljava/lang/Object;J)I

    .line 24
    .line 25
    .line 26
    move-result v2

    .line 27
    or-int/2addr p2, v2

    .line 28
    invoke-static {p1, v0, v1, p2}, Lxa/c0;->M(Ljava/lang/Object;JI)V

    .line 29
    .line 30
    .line 31
    return-void
.end method

.method private X(Ljava/lang/Object;II)V
    .locals 2

    .line 1
    invoke-direct {p0, p3}, Lxa/G;->Q(I)I

    .line 2
    .line 3
    .line 4
    move-result p3

    .line 5
    const v0, 0xfffff

    .line 6
    .line 7
    .line 8
    and-int/2addr p3, v0

    .line 9
    int-to-long v0, p3

    .line 10
    invoke-static {p1, v0, v1, p2}, Lxa/c0;->M(Ljava/lang/Object;JI)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method private Y(II)I
    .locals 4

    .line 1
    iget-object v0, p0, Lxa/G;->a:[I

    .line 2
    .line 3
    array-length v0, v0

    .line 4
    div-int/lit8 v0, v0, 0x3

    .line 5
    .line 6
    add-int/lit8 v0, v0, -0x1

    .line 7
    .line 8
    :goto_0
    if-gt p2, v0, :cond_2

    .line 9
    .line 10
    add-int v1, v0, p2

    .line 11
    .line 12
    ushr-int/lit8 v1, v1, 0x1

    .line 13
    .line 14
    mul-int/lit8 v2, v1, 0x3

    .line 15
    .line 16
    invoke-direct {p0, v2}, Lxa/G;->I(I)I

    .line 17
    .line 18
    .line 19
    move-result v3

    .line 20
    if-ne p1, v3, :cond_0

    .line 21
    .line 22
    return v2

    .line 23
    :cond_0
    if-ge p1, v3, :cond_1

    .line 24
    .line 25
    add-int/lit8 v1, v1, -0x1

    .line 26
    .line 27
    move v0, v1

    .line 28
    goto :goto_0

    .line 29
    :cond_1
    add-int/lit8 v1, v1, 0x1

    .line 30
    .line 31
    move p2, v1

    .line 32
    goto :goto_0

    .line 33
    :cond_2
    const/4 p1, -0x1

    .line 34
    return p1
.end method

.method private Z(Ljava/lang/Object;ILjava/lang/Object;)V
    .locals 3

    .line 1
    sget-object v0, Lxa/G;->s:Lsun/misc/Unsafe;

    .line 2
    .line 3
    invoke-direct {p0, p2}, Lxa/G;->c0(I)I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    invoke-static {v1}, Lxa/G;->J(I)J

    .line 8
    .line 9
    .line 10
    move-result-wide v1

    .line 11
    invoke-virtual {v0, p1, v1, v2, p3}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    invoke-direct {p0, p1, p2}, Lxa/G;->W(Ljava/lang/Object;I)V

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method private a0(Ljava/lang/Object;IILjava/lang/Object;)V
    .locals 3

    .line 1
    sget-object v0, Lxa/G;->s:Lsun/misc/Unsafe;

    .line 2
    .line 3
    invoke-direct {p0, p3}, Lxa/G;->c0(I)I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    invoke-static {v1}, Lxa/G;->J(I)J

    .line 8
    .line 9
    .line 10
    move-result-wide v1

    .line 11
    invoke-virtual {v0, p1, v1, v2, p4}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    invoke-direct {p0, p1, p2, p3}, Lxa/G;->X(Ljava/lang/Object;II)V

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method private static b0(I)I
    .locals 1

    .line 1
    const/high16 v0, 0xff00000

    .line 2
    .line 3
    and-int/2addr p0, v0

    .line 4
    ushr-int/lit8 p0, p0, 0x14

    .line 5
    .line 6
    return p0
.end method

.method private c0(I)I
    .locals 1

    .line 1
    iget-object v0, p0, Lxa/G;->a:[I

    .line 2
    .line 3
    add-int/lit8 p1, p1, 0x1

    .line 4
    .line 5
    aget p1, v0, p1

    .line 6
    .line 7
    return p1
.end method

.method private h(Ljava/lang/Object;Ljava/lang/Object;I)Z
    .locals 0

    .line 1
    invoke-direct {p0, p1, p3}, Lxa/G;->p(Ljava/lang/Object;I)Z

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    invoke-direct {p0, p2, p3}, Lxa/G;->p(Ljava/lang/Object;I)Z

    .line 6
    .line 7
    .line 8
    move-result p2

    .line 9
    if-ne p1, p2, :cond_0

    .line 10
    .line 11
    const/4 p1, 0x1

    .line 12
    return p1

    .line 13
    :cond_0
    const/4 p1, 0x0

    .line 14
    return p1
.end method

.method private static i(Ljava/lang/Object;)V
    .locals 3

    .line 1
    invoke-static {p0}, Lxa/G;->u(Ljava/lang/Object;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 9
    .line 10
    new-instance v1, Ljava/lang/StringBuilder;

    .line 11
    .line 12
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 13
    .line 14
    .line 15
    const-string v2, "Mutating immutable message: "

    .line 16
    .line 17
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    throw v0
.end method

.method private j(Ljava/lang/Object;Ljava/lang/Object;I)Z
    .locals 7

    .line 1
    invoke-direct {p0, p3}, Lxa/G;->c0(I)I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-static {v0}, Lxa/G;->J(I)J

    .line 6
    .line 7
    .line 8
    move-result-wide v1

    .line 9
    invoke-static {v0}, Lxa/G;->b0(I)I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    const/4 v3, 0x0

    .line 14
    const/4 v4, 0x1

    .line 15
    packed-switch v0, :pswitch_data_0

    .line 16
    .line 17
    .line 18
    return v4

    .line 19
    :pswitch_0
    invoke-direct {p0, p1, p2, p3}, Lxa/G;->v(Ljava/lang/Object;Ljava/lang/Object;I)Z

    .line 20
    .line 21
    .line 22
    move-result p3

    .line 23
    if-eqz p3, :cond_0

    .line 24
    .line 25
    invoke-static {p1, v1, v2}, Lxa/c0;->A(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    invoke-static {p2, v1, v2}, Lxa/c0;->A(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object p2

    .line 33
    invoke-static {p1, p2}, Lxa/U;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    move-result p1

    .line 37
    if-eqz p1, :cond_0

    .line 38
    .line 39
    return v4

    .line 40
    :cond_0
    return v3

    .line 41
    :pswitch_1
    invoke-static {p1, v1, v2}, Lxa/c0;->A(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    invoke-static {p2, v1, v2}, Lxa/c0;->A(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object p2

    .line 49
    invoke-static {p1, p2}, Lxa/U;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 50
    .line 51
    .line 52
    move-result p1

    .line 53
    return p1

    .line 54
    :pswitch_2
    invoke-static {p1, v1, v2}, Lxa/c0;->A(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    invoke-static {p2, v1, v2}, Lxa/c0;->A(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object p2

    .line 62
    invoke-static {p1, p2}, Lxa/U;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 63
    .line 64
    .line 65
    move-result p1

    .line 66
    return p1

    .line 67
    :pswitch_3
    invoke-direct {p0, p1, p2, p3}, Lxa/G;->h(Ljava/lang/Object;Ljava/lang/Object;I)Z

    .line 68
    .line 69
    .line 70
    move-result p3

    .line 71
    if-eqz p3, :cond_1

    .line 72
    .line 73
    invoke-static {p1, v1, v2}, Lxa/c0;->A(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    move-result-object p1

    .line 77
    invoke-static {p2, v1, v2}, Lxa/c0;->A(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    move-result-object p2

    .line 81
    invoke-static {p1, p2}, Lxa/U;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 82
    .line 83
    .line 84
    move-result p1

    .line 85
    if-eqz p1, :cond_1

    .line 86
    .line 87
    return v4

    .line 88
    :cond_1
    return v3

    .line 89
    :pswitch_4
    invoke-direct {p0, p1, p2, p3}, Lxa/G;->h(Ljava/lang/Object;Ljava/lang/Object;I)Z

    .line 90
    .line 91
    .line 92
    move-result p3

    .line 93
    if-eqz p3, :cond_2

    .line 94
    .line 95
    invoke-static {p1, v1, v2}, Lxa/c0;->y(Ljava/lang/Object;J)J

    .line 96
    .line 97
    .line 98
    move-result-wide v5

    .line 99
    invoke-static {p2, v1, v2}, Lxa/c0;->y(Ljava/lang/Object;J)J

    .line 100
    .line 101
    .line 102
    move-result-wide p1

    .line 103
    cmp-long p1, v5, p1

    .line 104
    .line 105
    if-nez p1, :cond_2

    .line 106
    .line 107
    return v4

    .line 108
    :cond_2
    return v3

    .line 109
    :pswitch_5
    invoke-direct {p0, p1, p2, p3}, Lxa/G;->h(Ljava/lang/Object;Ljava/lang/Object;I)Z

    .line 110
    .line 111
    .line 112
    move-result p3

    .line 113
    if-eqz p3, :cond_3

    .line 114
    .line 115
    invoke-static {p1, v1, v2}, Lxa/c0;->x(Ljava/lang/Object;J)I

    .line 116
    .line 117
    .line 118
    move-result p1

    .line 119
    invoke-static {p2, v1, v2}, Lxa/c0;->x(Ljava/lang/Object;J)I

    .line 120
    .line 121
    .line 122
    move-result p2

    .line 123
    if-ne p1, p2, :cond_3

    .line 124
    .line 125
    return v4

    .line 126
    :cond_3
    return v3

    .line 127
    :pswitch_6
    invoke-direct {p0, p1, p2, p3}, Lxa/G;->h(Ljava/lang/Object;Ljava/lang/Object;I)Z

    .line 128
    .line 129
    .line 130
    move-result p3

    .line 131
    if-eqz p3, :cond_4

    .line 132
    .line 133
    invoke-static {p1, v1, v2}, Lxa/c0;->y(Ljava/lang/Object;J)J

    .line 134
    .line 135
    .line 136
    move-result-wide v5

    .line 137
    invoke-static {p2, v1, v2}, Lxa/c0;->y(Ljava/lang/Object;J)J

    .line 138
    .line 139
    .line 140
    move-result-wide p1

    .line 141
    cmp-long p1, v5, p1

    .line 142
    .line 143
    if-nez p1, :cond_4

    .line 144
    .line 145
    return v4

    .line 146
    :cond_4
    return v3

    .line 147
    :pswitch_7
    invoke-direct {p0, p1, p2, p3}, Lxa/G;->h(Ljava/lang/Object;Ljava/lang/Object;I)Z

    .line 148
    .line 149
    .line 150
    move-result p3

    .line 151
    if-eqz p3, :cond_5

    .line 152
    .line 153
    invoke-static {p1, v1, v2}, Lxa/c0;->x(Ljava/lang/Object;J)I

    .line 154
    .line 155
    .line 156
    move-result p1

    .line 157
    invoke-static {p2, v1, v2}, Lxa/c0;->x(Ljava/lang/Object;J)I

    .line 158
    .line 159
    .line 160
    move-result p2

    .line 161
    if-ne p1, p2, :cond_5

    .line 162
    .line 163
    return v4

    .line 164
    :cond_5
    return v3

    .line 165
    :pswitch_8
    invoke-direct {p0, p1, p2, p3}, Lxa/G;->h(Ljava/lang/Object;Ljava/lang/Object;I)Z

    .line 166
    .line 167
    .line 168
    move-result p3

    .line 169
    if-eqz p3, :cond_6

    .line 170
    .line 171
    invoke-static {p1, v1, v2}, Lxa/c0;->x(Ljava/lang/Object;J)I

    .line 172
    .line 173
    .line 174
    move-result p1

    .line 175
    invoke-static {p2, v1, v2}, Lxa/c0;->x(Ljava/lang/Object;J)I

    .line 176
    .line 177
    .line 178
    move-result p2

    .line 179
    if-ne p1, p2, :cond_6

    .line 180
    .line 181
    return v4

    .line 182
    :cond_6
    return v3

    .line 183
    :pswitch_9
    invoke-direct {p0, p1, p2, p3}, Lxa/G;->h(Ljava/lang/Object;Ljava/lang/Object;I)Z

    .line 184
    .line 185
    .line 186
    move-result p3

    .line 187
    if-eqz p3, :cond_7

    .line 188
    .line 189
    invoke-static {p1, v1, v2}, Lxa/c0;->x(Ljava/lang/Object;J)I

    .line 190
    .line 191
    .line 192
    move-result p1

    .line 193
    invoke-static {p2, v1, v2}, Lxa/c0;->x(Ljava/lang/Object;J)I

    .line 194
    .line 195
    .line 196
    move-result p2

    .line 197
    if-ne p1, p2, :cond_7

    .line 198
    .line 199
    return v4

    .line 200
    :cond_7
    return v3

    .line 201
    :pswitch_a
    invoke-direct {p0, p1, p2, p3}, Lxa/G;->h(Ljava/lang/Object;Ljava/lang/Object;I)Z

    .line 202
    .line 203
    .line 204
    move-result p3

    .line 205
    if-eqz p3, :cond_8

    .line 206
    .line 207
    invoke-static {p1, v1, v2}, Lxa/c0;->A(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 208
    .line 209
    .line 210
    move-result-object p1

    .line 211
    invoke-static {p2, v1, v2}, Lxa/c0;->A(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 212
    .line 213
    .line 214
    move-result-object p2

    .line 215
    invoke-static {p1, p2}, Lxa/U;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 216
    .line 217
    .line 218
    move-result p1

    .line 219
    if-eqz p1, :cond_8

    .line 220
    .line 221
    return v4

    .line 222
    :cond_8
    return v3

    .line 223
    :pswitch_b
    invoke-direct {p0, p1, p2, p3}, Lxa/G;->h(Ljava/lang/Object;Ljava/lang/Object;I)Z

    .line 224
    .line 225
    .line 226
    move-result p3

    .line 227
    if-eqz p3, :cond_9

    .line 228
    .line 229
    invoke-static {p1, v1, v2}, Lxa/c0;->A(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 230
    .line 231
    .line 232
    move-result-object p1

    .line 233
    invoke-static {p2, v1, v2}, Lxa/c0;->A(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 234
    .line 235
    .line 236
    move-result-object p2

    .line 237
    invoke-static {p1, p2}, Lxa/U;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 238
    .line 239
    .line 240
    move-result p1

    .line 241
    if-eqz p1, :cond_9

    .line 242
    .line 243
    return v4

    .line 244
    :cond_9
    return v3

    .line 245
    :pswitch_c
    invoke-direct {p0, p1, p2, p3}, Lxa/G;->h(Ljava/lang/Object;Ljava/lang/Object;I)Z

    .line 246
    .line 247
    .line 248
    move-result p3

    .line 249
    if-eqz p3, :cond_a

    .line 250
    .line 251
    invoke-static {p1, v1, v2}, Lxa/c0;->A(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 252
    .line 253
    .line 254
    move-result-object p1

    .line 255
    invoke-static {p2, v1, v2}, Lxa/c0;->A(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 256
    .line 257
    .line 258
    move-result-object p2

    .line 259
    invoke-static {p1, p2}, Lxa/U;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 260
    .line 261
    .line 262
    move-result p1

    .line 263
    if-eqz p1, :cond_a

    .line 264
    .line 265
    return v4

    .line 266
    :cond_a
    return v3

    .line 267
    :pswitch_d
    invoke-direct {p0, p1, p2, p3}, Lxa/G;->h(Ljava/lang/Object;Ljava/lang/Object;I)Z

    .line 268
    .line 269
    .line 270
    move-result p3

    .line 271
    if-eqz p3, :cond_b

    .line 272
    .line 273
    invoke-static {p1, v1, v2}, Lxa/c0;->p(Ljava/lang/Object;J)Z

    .line 274
    .line 275
    .line 276
    move-result p1

    .line 277
    invoke-static {p2, v1, v2}, Lxa/c0;->p(Ljava/lang/Object;J)Z

    .line 278
    .line 279
    .line 280
    move-result p2

    .line 281
    if-ne p1, p2, :cond_b

    .line 282
    .line 283
    return v4

    .line 284
    :cond_b
    return v3

    .line 285
    :pswitch_e
    invoke-direct {p0, p1, p2, p3}, Lxa/G;->h(Ljava/lang/Object;Ljava/lang/Object;I)Z

    .line 286
    .line 287
    .line 288
    move-result p3

    .line 289
    if-eqz p3, :cond_c

    .line 290
    .line 291
    invoke-static {p1, v1, v2}, Lxa/c0;->x(Ljava/lang/Object;J)I

    .line 292
    .line 293
    .line 294
    move-result p1

    .line 295
    invoke-static {p2, v1, v2}, Lxa/c0;->x(Ljava/lang/Object;J)I

    .line 296
    .line 297
    .line 298
    move-result p2

    .line 299
    if-ne p1, p2, :cond_c

    .line 300
    .line 301
    return v4

    .line 302
    :cond_c
    return v3

    .line 303
    :pswitch_f
    invoke-direct {p0, p1, p2, p3}, Lxa/G;->h(Ljava/lang/Object;Ljava/lang/Object;I)Z

    .line 304
    .line 305
    .line 306
    move-result p3

    .line 307
    if-eqz p3, :cond_d

    .line 308
    .line 309
    invoke-static {p1, v1, v2}, Lxa/c0;->y(Ljava/lang/Object;J)J

    .line 310
    .line 311
    .line 312
    move-result-wide v5

    .line 313
    invoke-static {p2, v1, v2}, Lxa/c0;->y(Ljava/lang/Object;J)J

    .line 314
    .line 315
    .line 316
    move-result-wide p1

    .line 317
    cmp-long p1, v5, p1

    .line 318
    .line 319
    if-nez p1, :cond_d

    .line 320
    .line 321
    return v4

    .line 322
    :cond_d
    return v3

    .line 323
    :pswitch_10
    invoke-direct {p0, p1, p2, p3}, Lxa/G;->h(Ljava/lang/Object;Ljava/lang/Object;I)Z

    .line 324
    .line 325
    .line 326
    move-result p3

    .line 327
    if-eqz p3, :cond_e

    .line 328
    .line 329
    invoke-static {p1, v1, v2}, Lxa/c0;->x(Ljava/lang/Object;J)I

    .line 330
    .line 331
    .line 332
    move-result p1

    .line 333
    invoke-static {p2, v1, v2}, Lxa/c0;->x(Ljava/lang/Object;J)I

    .line 334
    .line 335
    .line 336
    move-result p2

    .line 337
    if-ne p1, p2, :cond_e

    .line 338
    .line 339
    return v4

    .line 340
    :cond_e
    return v3

    .line 341
    :pswitch_11
    invoke-direct {p0, p1, p2, p3}, Lxa/G;->h(Ljava/lang/Object;Ljava/lang/Object;I)Z

    .line 342
    .line 343
    .line 344
    move-result p3

    .line 345
    if-eqz p3, :cond_f

    .line 346
    .line 347
    invoke-static {p1, v1, v2}, Lxa/c0;->y(Ljava/lang/Object;J)J

    .line 348
    .line 349
    .line 350
    move-result-wide v5

    .line 351
    invoke-static {p2, v1, v2}, Lxa/c0;->y(Ljava/lang/Object;J)J

    .line 352
    .line 353
    .line 354
    move-result-wide p1

    .line 355
    cmp-long p1, v5, p1

    .line 356
    .line 357
    if-nez p1, :cond_f

    .line 358
    .line 359
    return v4

    .line 360
    :cond_f
    return v3

    .line 361
    :pswitch_12
    invoke-direct {p0, p1, p2, p3}, Lxa/G;->h(Ljava/lang/Object;Ljava/lang/Object;I)Z

    .line 362
    .line 363
    .line 364
    move-result p3

    .line 365
    if-eqz p3, :cond_10

    .line 366
    .line 367
    invoke-static {p1, v1, v2}, Lxa/c0;->y(Ljava/lang/Object;J)J

    .line 368
    .line 369
    .line 370
    move-result-wide v5

    .line 371
    invoke-static {p2, v1, v2}, Lxa/c0;->y(Ljava/lang/Object;J)J

    .line 372
    .line 373
    .line 374
    move-result-wide p1

    .line 375
    cmp-long p1, v5, p1

    .line 376
    .line 377
    if-nez p1, :cond_10

    .line 378
    .line 379
    return v4

    .line 380
    :cond_10
    return v3

    .line 381
    :pswitch_13
    invoke-direct {p0, p1, p2, p3}, Lxa/G;->h(Ljava/lang/Object;Ljava/lang/Object;I)Z

    .line 382
    .line 383
    .line 384
    move-result p3

    .line 385
    if-eqz p3, :cond_11

    .line 386
    .line 387
    invoke-static {p1, v1, v2}, Lxa/c0;->w(Ljava/lang/Object;J)F

    .line 388
    .line 389
    .line 390
    move-result p1

    .line 391
    invoke-static {p1}, Ljava/lang/Float;->floatToIntBits(F)I

    .line 392
    .line 393
    .line 394
    move-result p1

    .line 395
    invoke-static {p2, v1, v2}, Lxa/c0;->w(Ljava/lang/Object;J)F

    .line 396
    .line 397
    .line 398
    move-result p2

    .line 399
    invoke-static {p2}, Ljava/lang/Float;->floatToIntBits(F)I

    .line 400
    .line 401
    .line 402
    move-result p2

    .line 403
    if-ne p1, p2, :cond_11

    .line 404
    .line 405
    return v4

    .line 406
    :cond_11
    return v3

    .line 407
    :pswitch_14
    invoke-direct {p0, p1, p2, p3}, Lxa/G;->h(Ljava/lang/Object;Ljava/lang/Object;I)Z

    .line 408
    .line 409
    .line 410
    move-result p3

    .line 411
    if-eqz p3, :cond_12

    .line 412
    .line 413
    invoke-static {p1, v1, v2}, Lxa/c0;->v(Ljava/lang/Object;J)D

    .line 414
    .line 415
    .line 416
    move-result-wide v5

    .line 417
    invoke-static {v5, v6}, Ljava/lang/Double;->doubleToLongBits(D)J

    .line 418
    .line 419
    .line 420
    move-result-wide v5

    .line 421
    invoke-static {p2, v1, v2}, Lxa/c0;->v(Ljava/lang/Object;J)D

    .line 422
    .line 423
    .line 424
    move-result-wide p1

    .line 425
    invoke-static {p1, p2}, Ljava/lang/Double;->doubleToLongBits(D)J

    .line 426
    .line 427
    .line 428
    move-result-wide p1

    .line 429
    cmp-long p1, v5, p1

    .line 430
    .line 431
    if-nez p1, :cond_12

    .line 432
    .line 433
    return v4

    .line 434
    :cond_12
    return v3

    .line 435
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_1
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method private k(Ljava/lang/Object;ILjava/lang/Object;Lxa/Y;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-direct {p0, p2}, Lxa/G;->I(I)I

    .line 2
    .line 3
    .line 4
    invoke-direct {p0, p2}, Lxa/G;->c0(I)I

    .line 5
    .line 6
    .line 7
    move-result p4

    .line 8
    invoke-static {p4}, Lxa/G;->J(I)J

    .line 9
    .line 10
    .line 11
    move-result-wide p4

    .line 12
    invoke-static {p1, p4, p5}, Lxa/c0;->A(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    if-nez p1, :cond_0

    .line 17
    .line 18
    return-object p3

    .line 19
    :cond_0
    invoke-direct {p0, p2}, Lxa/G;->l(I)Lxa/q$a;

    .line 20
    .line 21
    .line 22
    return-object p3
.end method

.method private l(I)Lxa/q$a;
    .locals 1

    .line 1
    iget-object v0, p0, Lxa/G;->b:[Ljava/lang/Object;

    .line 2
    .line 3
    div-int/lit8 p1, p1, 0x3

    .line 4
    .line 5
    mul-int/lit8 p1, p1, 0x2

    .line 6
    .line 7
    add-int/lit8 p1, p1, 0x1

    .line 8
    .line 9
    aget-object p1, v0, p1

    .line 10
    .line 11
    invoke-static {p1}, Landroid/support/v4/media/session/b;->a(Ljava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    const/4 p1, 0x0

    .line 15
    return-object p1
.end method

.method private m(I)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lxa/G;->b:[Ljava/lang/Object;

    .line 2
    .line 3
    div-int/lit8 p1, p1, 0x3

    .line 4
    .line 5
    mul-int/lit8 p1, p1, 0x2

    .line 6
    .line 7
    aget-object p1, v0, p1

    .line 8
    .line 9
    return-object p1
.end method

.method private n(I)Lxa/S;
    .locals 3

    .line 1
    div-int/lit8 p1, p1, 0x3

    .line 2
    .line 3
    mul-int/lit8 p1, p1, 0x2

    .line 4
    .line 5
    iget-object v0, p0, Lxa/G;->b:[Ljava/lang/Object;

    .line 6
    .line 7
    aget-object v0, v0, p1

    .line 8
    .line 9
    check-cast v0, Lxa/S;

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    return-object v0

    .line 14
    :cond_0
    invoke-static {}, Lxa/N;->a()Lxa/N;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    iget-object v1, p0, Lxa/G;->b:[Ljava/lang/Object;

    .line 19
    .line 20
    add-int/lit8 v2, p1, 0x1

    .line 21
    .line 22
    aget-object v1, v1, v2

    .line 23
    .line 24
    check-cast v1, Ljava/lang/Class;

    .line 25
    .line 26
    invoke-virtual {v0, v1}, Lxa/N;->c(Ljava/lang/Class;)Lxa/S;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    iget-object v1, p0, Lxa/G;->b:[Ljava/lang/Object;

    .line 31
    .line 32
    aput-object v0, v1, p1

    .line 33
    .line 34
    return-object v0
.end method

.method private static o(I)Z
    .locals 1

    .line 1
    const/high16 v0, 0x20000000

    .line 2
    .line 3
    and-int/2addr p0, v0

    .line 4
    if-eqz p0, :cond_0

    .line 5
    .line 6
    const/4 p0, 0x1

    .line 7
    return p0

    .line 8
    :cond_0
    const/4 p0, 0x0

    .line 9
    return p0
.end method

.method private p(Ljava/lang/Object;I)Z
    .locals 6

    .line 1
    invoke-direct {p0, p2}, Lxa/G;->Q(I)I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const v1, 0xfffff

    .line 6
    .line 7
    .line 8
    and-int/2addr v1, v0

    .line 9
    int-to-long v1, v1

    .line 10
    const-wide/32 v3, 0xfffff

    .line 11
    .line 12
    .line 13
    cmp-long v3, v1, v3

    .line 14
    .line 15
    const/4 v4, 0x0

    .line 16
    const/4 v5, 0x1

    .line 17
    if-nez v3, :cond_11

    .line 18
    .line 19
    invoke-direct {p0, p2}, Lxa/G;->c0(I)I

    .line 20
    .line 21
    .line 22
    move-result p2

    .line 23
    invoke-static {p2}, Lxa/G;->J(I)J

    .line 24
    .line 25
    .line 26
    move-result-wide v0

    .line 27
    invoke-static {p2}, Lxa/G;->b0(I)I

    .line 28
    .line 29
    .line 30
    move-result p2

    .line 31
    const-wide/16 v2, 0x0

    .line 32
    .line 33
    packed-switch p2, :pswitch_data_0

    .line 34
    .line 35
    .line 36
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 37
    .line 38
    invoke-direct {p1}, Ljava/lang/IllegalArgumentException;-><init>()V

    .line 39
    .line 40
    .line 41
    throw p1

    .line 42
    :pswitch_0
    invoke-static {p1, v0, v1}, Lxa/c0;->A(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    if-eqz p1, :cond_0

    .line 47
    .line 48
    return v5

    .line 49
    :cond_0
    return v4

    .line 50
    :pswitch_1
    invoke-static {p1, v0, v1}, Lxa/c0;->y(Ljava/lang/Object;J)J

    .line 51
    .line 52
    .line 53
    move-result-wide p1

    .line 54
    cmp-long p1, p1, v2

    .line 55
    .line 56
    if-eqz p1, :cond_1

    .line 57
    .line 58
    return v5

    .line 59
    :cond_1
    return v4

    .line 60
    :pswitch_2
    invoke-static {p1, v0, v1}, Lxa/c0;->x(Ljava/lang/Object;J)I

    .line 61
    .line 62
    .line 63
    move-result p1

    .line 64
    if-eqz p1, :cond_2

    .line 65
    .line 66
    return v5

    .line 67
    :cond_2
    return v4

    .line 68
    :pswitch_3
    invoke-static {p1, v0, v1}, Lxa/c0;->y(Ljava/lang/Object;J)J

    .line 69
    .line 70
    .line 71
    move-result-wide p1

    .line 72
    cmp-long p1, p1, v2

    .line 73
    .line 74
    if-eqz p1, :cond_3

    .line 75
    .line 76
    return v5

    .line 77
    :cond_3
    return v4

    .line 78
    :pswitch_4
    invoke-static {p1, v0, v1}, Lxa/c0;->x(Ljava/lang/Object;J)I

    .line 79
    .line 80
    .line 81
    move-result p1

    .line 82
    if-eqz p1, :cond_4

    .line 83
    .line 84
    return v5

    .line 85
    :cond_4
    return v4

    .line 86
    :pswitch_5
    invoke-static {p1, v0, v1}, Lxa/c0;->x(Ljava/lang/Object;J)I

    .line 87
    .line 88
    .line 89
    move-result p1

    .line 90
    if-eqz p1, :cond_5

    .line 91
    .line 92
    return v5

    .line 93
    :cond_5
    return v4

    .line 94
    :pswitch_6
    invoke-static {p1, v0, v1}, Lxa/c0;->x(Ljava/lang/Object;J)I

    .line 95
    .line 96
    .line 97
    move-result p1

    .line 98
    if-eqz p1, :cond_6

    .line 99
    .line 100
    return v5

    .line 101
    :cond_6
    return v4

    .line 102
    :pswitch_7
    sget-object p2, Lxa/e;->b:Lxa/e;

    .line 103
    .line 104
    invoke-static {p1, v0, v1}, Lxa/c0;->A(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 105
    .line 106
    .line 107
    move-result-object p1

    .line 108
    invoke-virtual {p2, p1}, Lxa/e;->equals(Ljava/lang/Object;)Z

    .line 109
    .line 110
    .line 111
    move-result p1

    .line 112
    :goto_0
    xor-int/2addr p1, v5

    .line 113
    return p1

    .line 114
    :pswitch_8
    invoke-static {p1, v0, v1}, Lxa/c0;->A(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 115
    .line 116
    .line 117
    move-result-object p1

    .line 118
    if-eqz p1, :cond_7

    .line 119
    .line 120
    return v5

    .line 121
    :cond_7
    return v4

    .line 122
    :pswitch_9
    invoke-static {p1, v0, v1}, Lxa/c0;->A(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 123
    .line 124
    .line 125
    move-result-object p1

    .line 126
    instance-of p2, p1, Ljava/lang/String;

    .line 127
    .line 128
    if-eqz p2, :cond_8

    .line 129
    .line 130
    check-cast p1, Ljava/lang/String;

    .line 131
    .line 132
    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    .line 133
    .line 134
    .line 135
    move-result p1

    .line 136
    goto :goto_0

    .line 137
    :cond_8
    instance-of p2, p1, Lxa/e;

    .line 138
    .line 139
    if-eqz p2, :cond_9

    .line 140
    .line 141
    sget-object p2, Lxa/e;->b:Lxa/e;

    .line 142
    .line 143
    invoke-virtual {p2, p1}, Lxa/e;->equals(Ljava/lang/Object;)Z

    .line 144
    .line 145
    .line 146
    move-result p1

    .line 147
    goto :goto_0

    .line 148
    :cond_9
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 149
    .line 150
    invoke-direct {p1}, Ljava/lang/IllegalArgumentException;-><init>()V

    .line 151
    .line 152
    .line 153
    throw p1

    .line 154
    :pswitch_a
    invoke-static {p1, v0, v1}, Lxa/c0;->p(Ljava/lang/Object;J)Z

    .line 155
    .line 156
    .line 157
    move-result p1

    .line 158
    return p1

    .line 159
    :pswitch_b
    invoke-static {p1, v0, v1}, Lxa/c0;->x(Ljava/lang/Object;J)I

    .line 160
    .line 161
    .line 162
    move-result p1

    .line 163
    if-eqz p1, :cond_a

    .line 164
    .line 165
    return v5

    .line 166
    :cond_a
    return v4

    .line 167
    :pswitch_c
    invoke-static {p1, v0, v1}, Lxa/c0;->y(Ljava/lang/Object;J)J

    .line 168
    .line 169
    .line 170
    move-result-wide p1

    .line 171
    cmp-long p1, p1, v2

    .line 172
    .line 173
    if-eqz p1, :cond_b

    .line 174
    .line 175
    return v5

    .line 176
    :cond_b
    return v4

    .line 177
    :pswitch_d
    invoke-static {p1, v0, v1}, Lxa/c0;->x(Ljava/lang/Object;J)I

    .line 178
    .line 179
    .line 180
    move-result p1

    .line 181
    if-eqz p1, :cond_c

    .line 182
    .line 183
    return v5

    .line 184
    :cond_c
    return v4

    .line 185
    :pswitch_e
    invoke-static {p1, v0, v1}, Lxa/c0;->y(Ljava/lang/Object;J)J

    .line 186
    .line 187
    .line 188
    move-result-wide p1

    .line 189
    cmp-long p1, p1, v2

    .line 190
    .line 191
    if-eqz p1, :cond_d

    .line 192
    .line 193
    return v5

    .line 194
    :cond_d
    return v4

    .line 195
    :pswitch_f
    invoke-static {p1, v0, v1}, Lxa/c0;->y(Ljava/lang/Object;J)J

    .line 196
    .line 197
    .line 198
    move-result-wide p1

    .line 199
    cmp-long p1, p1, v2

    .line 200
    .line 201
    if-eqz p1, :cond_e

    .line 202
    .line 203
    return v5

    .line 204
    :cond_e
    return v4

    .line 205
    :pswitch_10
    invoke-static {p1, v0, v1}, Lxa/c0;->w(Ljava/lang/Object;J)F

    .line 206
    .line 207
    .line 208
    move-result p1

    .line 209
    invoke-static {p1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 210
    .line 211
    .line 212
    move-result p1

    .line 213
    if-eqz p1, :cond_f

    .line 214
    .line 215
    return v5

    .line 216
    :cond_f
    return v4

    .line 217
    :pswitch_11
    invoke-static {p1, v0, v1}, Lxa/c0;->v(Ljava/lang/Object;J)D

    .line 218
    .line 219
    .line 220
    move-result-wide p1

    .line 221
    invoke-static {p1, p2}, Ljava/lang/Double;->doubleToRawLongBits(D)J

    .line 222
    .line 223
    .line 224
    move-result-wide p1

    .line 225
    cmp-long p1, p1, v2

    .line 226
    .line 227
    if-eqz p1, :cond_10

    .line 228
    .line 229
    return v5

    .line 230
    :cond_10
    return v4

    .line 231
    :cond_11
    ushr-int/lit8 p2, v0, 0x14

    .line 232
    .line 233
    shl-int p2, v5, p2

    .line 234
    .line 235
    invoke-static {p1, v1, v2}, Lxa/c0;->x(Ljava/lang/Object;J)I

    .line 236
    .line 237
    .line 238
    move-result p1

    .line 239
    and-int/2addr p1, p2

    .line 240
    if-eqz p1, :cond_12

    .line 241
    .line 242
    return v5

    .line 243
    :cond_12
    return v4

    .line 244
    nop

    .line 245
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method private q(Ljava/lang/Object;IIII)Z
    .locals 1

    .line 1
    const v0, 0xfffff

    .line 2
    .line 3
    .line 4
    if-ne p3, v0, :cond_0

    .line 5
    .line 6
    invoke-direct {p0, p1, p2}, Lxa/G;->p(Ljava/lang/Object;I)Z

    .line 7
    .line 8
    .line 9
    move-result p1

    .line 10
    return p1

    .line 11
    :cond_0
    and-int p1, p4, p5

    .line 12
    .line 13
    if-eqz p1, :cond_1

    .line 14
    .line 15
    const/4 p1, 0x1

    .line 16
    return p1

    .line 17
    :cond_1
    const/4 p1, 0x0

    .line 18
    return p1
.end method

.method private static r(Ljava/lang/Object;ILxa/S;)Z
    .locals 2

    .line 1
    invoke-static {p1}, Lxa/G;->J(I)J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    invoke-static {p0, v0, v1}, Lxa/c0;->A(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    invoke-interface {p2, p0}, Lxa/S;->d(Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    return p0
.end method

.method private s(Ljava/lang/Object;II)Z
    .locals 3

    .line 1
    invoke-static {p2}, Lxa/G;->J(I)J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    invoke-static {p1, v0, v1}, Lxa/c0;->A(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, Ljava/util/List;

    .line 10
    .line 11
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 12
    .line 13
    .line 14
    move-result p2

    .line 15
    const/4 v0, 0x1

    .line 16
    if-eqz p2, :cond_0

    .line 17
    .line 18
    return v0

    .line 19
    :cond_0
    invoke-direct {p0, p3}, Lxa/G;->n(I)Lxa/S;

    .line 20
    .line 21
    .line 22
    move-result-object p2

    .line 23
    const/4 p3, 0x0

    .line 24
    move v1, p3

    .line 25
    :goto_0
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 26
    .line 27
    .line 28
    move-result v2

    .line 29
    if-ge v1, v2, :cond_2

    .line 30
    .line 31
    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v2

    .line 35
    invoke-interface {p2, v2}, Lxa/S;->d(Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    move-result v2

    .line 39
    if-nez v2, :cond_1

    .line 40
    .line 41
    return p3

    .line 42
    :cond_1
    add-int/lit8 v1, v1, 0x1

    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_2
    return v0
.end method

.method private t(Ljava/lang/Object;II)Z
    .locals 3

    .line 1
    iget-object v0, p0, Lxa/G;->q:Lxa/y;

    .line 2
    .line 3
    invoke-static {p2}, Lxa/G;->J(I)J

    .line 4
    .line 5
    .line 6
    move-result-wide v1

    .line 7
    invoke-static {p1, v1, v2}, Lxa/c0;->A(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-interface {v0, p1}, Lxa/y;->e(Ljava/lang/Object;)Ljava/util/Map;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    invoke-interface {p1}, Ljava/util/Map;->isEmpty()Z

    .line 16
    .line 17
    .line 18
    move-result p2

    .line 19
    const/4 v0, 0x1

    .line 20
    if-eqz p2, :cond_0

    .line 21
    .line 22
    return v0

    .line 23
    :cond_0
    invoke-direct {p0, p3}, Lxa/G;->m(I)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object p2

    .line 27
    iget-object p3, p0, Lxa/G;->q:Lxa/y;

    .line 28
    .line 29
    invoke-interface {p3, p2}, Lxa/y;->b(Ljava/lang/Object;)Lxa/w$a;

    .line 30
    .line 31
    .line 32
    move-result-object p2

    .line 33
    iget-object p2, p2, Lxa/w$a;->c:Lxa/e0$b;

    .line 34
    .line 35
    invoke-virtual {p2}, Lxa/e0$b;->a()Lxa/e0$c;

    .line 36
    .line 37
    .line 38
    move-result-object p2

    .line 39
    sget-object p3, Lxa/e0$c;->j:Lxa/e0$c;

    .line 40
    .line 41
    if-eq p2, p3, :cond_1

    .line 42
    .line 43
    return v0

    .line 44
    :cond_1
    invoke-interface {p1}, Ljava/util/Map;->values()Ljava/util/Collection;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    const/4 p2, 0x0

    .line 53
    :cond_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 54
    .line 55
    .line 56
    move-result p3

    .line 57
    if-eqz p3, :cond_4

    .line 58
    .line 59
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object p3

    .line 63
    if-nez p2, :cond_3

    .line 64
    .line 65
    invoke-static {}, Lxa/N;->a()Lxa/N;

    .line 66
    .line 67
    .line 68
    move-result-object p2

    .line 69
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 70
    .line 71
    .line 72
    move-result-object v1

    .line 73
    invoke-virtual {p2, v1}, Lxa/N;->c(Ljava/lang/Class;)Lxa/S;

    .line 74
    .line 75
    .line 76
    move-result-object p2

    .line 77
    :cond_3
    invoke-interface {p2, p3}, Lxa/S;->d(Ljava/lang/Object;)Z

    .line 78
    .line 79
    .line 80
    move-result p3

    .line 81
    if-nez p3, :cond_2

    .line 82
    .line 83
    const/4 p1, 0x0

    .line 84
    return p1

    .line 85
    :cond_4
    return v0
.end method

.method private static u(Ljava/lang/Object;)Z
    .locals 1

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    const/4 p0, 0x0

    .line 4
    return p0

    .line 5
    :cond_0
    instance-of v0, p0, Lxa/p;

    .line 6
    .line 7
    if-eqz v0, :cond_1

    .line 8
    .line 9
    check-cast p0, Lxa/p;

    .line 10
    .line 11
    invoke-virtual {p0}, Lxa/p;->t()Z

    .line 12
    .line 13
    .line 14
    move-result p0

    .line 15
    return p0

    .line 16
    :cond_1
    const/4 p0, 0x1

    .line 17
    return p0
.end method

.method private v(Ljava/lang/Object;Ljava/lang/Object;I)Z
    .locals 2

    .line 1
    invoke-direct {p0, p3}, Lxa/G;->Q(I)I

    .line 2
    .line 3
    .line 4
    move-result p3

    .line 5
    const v0, 0xfffff

    .line 6
    .line 7
    .line 8
    and-int/2addr p3, v0

    .line 9
    int-to-long v0, p3

    .line 10
    invoke-static {p1, v0, v1}, Lxa/c0;->x(Ljava/lang/Object;J)I

    .line 11
    .line 12
    .line 13
    move-result p1

    .line 14
    invoke-static {p2, v0, v1}, Lxa/c0;->x(Ljava/lang/Object;J)I

    .line 15
    .line 16
    .line 17
    move-result p2

    .line 18
    if-ne p1, p2, :cond_0

    .line 19
    .line 20
    const/4 p1, 0x1

    .line 21
    return p1

    .line 22
    :cond_0
    const/4 p1, 0x0

    .line 23
    return p1
.end method

.method private w(Ljava/lang/Object;II)Z
    .locals 2

    .line 1
    invoke-direct {p0, p3}, Lxa/G;->Q(I)I

    .line 2
    .line 3
    .line 4
    move-result p3

    .line 5
    const v0, 0xfffff

    .line 6
    .line 7
    .line 8
    and-int/2addr p3, v0

    .line 9
    int-to-long v0, p3

    .line 10
    invoke-static {p1, v0, v1}, Lxa/c0;->x(Ljava/lang/Object;J)I

    .line 11
    .line 12
    .line 13
    move-result p1

    .line 14
    if-ne p1, p2, :cond_0

    .line 15
    .line 16
    const/4 p1, 0x1

    .line 17
    return p1

    .line 18
    :cond_0
    const/4 p1, 0x0

    .line 19
    return p1
.end method

.method private static x(I)Z
    .locals 1

    .line 1
    const/high16 v0, 0x10000000

    .line 2
    .line 3
    and-int/2addr p0, v0

    .line 4
    if-eqz p0, :cond_0

    .line 5
    .line 6
    const/4 p0, 0x1

    .line 7
    return p0

    .line 8
    :cond_0
    const/4 p0, 0x0

    .line 9
    return p0
.end method

.method private y(Lxa/Y;Lxa/k;Ljava/lang/Object;Lxa/Q;Lxa/j;)V
    .locals 16

    move-object/from16 v1, p0

    move-object/from16 v4, p5

    const/4 v8, 0x0

    move-object v5, v8

    .line 1
    :goto_0
    :try_start_0
    invoke-interface/range {p4 .. p4}, Lxa/Q;->A()I

    move-result v2

    .line 2
    invoke-direct {v1, v2}, Lxa/G;->P(I)I

    move-result v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_17

    const/4 v0, 0x0

    if-gez v3, :cond_a

    const v3, 0x7fffffff

    if-ne v2, v3, :cond_2

    .line 3
    iget v0, v1, Lxa/G;->k:I

    move-object v4, v5

    :goto_1
    iget v2, v1, Lxa/G;->l:I

    if-ge v0, v2, :cond_0

    .line 4
    iget-object v2, v1, Lxa/G;->j:[I

    aget v3, v2, v0

    move-object/from16 v6, p3

    move-object/from16 v5, p1

    move-object/from16 v2, p3

    .line 5
    invoke-direct/range {v1 .. v6}, Lxa/G;->k(Ljava/lang/Object;ILjava/lang/Object;Lxa/Y;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    move-object v9, v1

    move-object v1, v2

    move-object v6, v5

    add-int/lit8 v0, v0, 0x1

    move-object v1, v9

    goto :goto_1

    :cond_0
    move-object/from16 v6, p1

    move-object v9, v1

    move-object/from16 v1, p3

    if-eqz v4, :cond_1

    .line 6
    invoke-virtual {v6, v1, v4}, Lxa/Y;->m(Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_1
    move-object v1, v9

    goto/16 :goto_25

    :cond_2
    move-object/from16 v6, p1

    move-object v9, v1

    move-object/from16 v1, p3

    .line 7
    :try_start_1
    iget-boolean v3, v9, Lxa/G;->f:Z

    if-nez v3, :cond_3

    move-object/from16 v7, p2

    move-object v3, v8

    goto :goto_2

    .line 8
    :cond_3
    iget-object v3, v9, Lxa/G;->e:Lxa/D;

    move-object/from16 v7, p2

    invoke-virtual {v7, v4, v3, v2}, Lxa/k;->a(Lxa/j;Lxa/D;I)Ljava/lang/Object;

    move-result-object v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_5

    move-object v3, v2

    :goto_2
    if-eqz v3, :cond_4

    move-object v6, v5

    .line 9
    :try_start_2
    invoke-virtual/range {p2 .. p3}, Lxa/k;->c(Ljava/lang/Object;)Lxa/n;

    move-result-object v5
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    move-object/from16 v2, p4

    move-object v0, v7

    move-object/from16 v7, p1

    .line 10
    :try_start_3
    invoke-virtual/range {v0 .. v7}, Lxa/k;->f(Ljava/lang/Object;Lxa/Q;Ljava/lang/Object;Lxa/j;Lxa/n;Ljava/lang/Object;Lxa/Y;)Ljava/lang/Object;

    move-result-object v5
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    move-object v6, v7

    move-object v7, v4

    move-object v4, v2

    move-object v2, v1

    :goto_3
    move-object v4, v7

    move-object v1, v9

    goto :goto_0

    :catchall_0
    move-exception v0

    move-object v2, v1

    move-object v10, v6

    move-object v6, v7

    goto :goto_4

    :catchall_1
    move-exception v0

    move-object v2, v1

    move-object v10, v6

    move-object/from16 v6, p1

    :goto_4
    move-object v1, v9

    :goto_5
    move-object v5, v10

    goto/16 :goto_27

    :cond_4
    move-object v2, v1

    move-object v7, v4

    move-object v10, v5

    move-object/from16 v4, p4

    .line 11
    :try_start_4
    invoke-virtual {v6, v4}, Lxa/Y;->o(Lxa/Q;)Z

    move-result v1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_4

    if-eqz v1, :cond_6

    .line 12
    :try_start_5
    invoke-interface {v4}, Lxa/Q;->D()Z

    move-result v0

    if-eqz v0, :cond_5

    move-object v4, v7

    move-object v1, v9

    move-object v5, v10

    goto/16 :goto_0

    :cond_5
    move-object v5, v10

    goto :goto_7

    :catchall_2
    move-exception v0

    goto :goto_4

    :cond_6
    if-nez v10, :cond_7

    .line 13
    invoke-virtual {v6, v2}, Lxa/Y;->f(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    move-object v5, v1

    goto :goto_6

    :cond_7
    move-object v5, v10

    .line 14
    :goto_6
    :try_start_6
    invoke-virtual {v6, v5, v4, v0}, Lxa/Y;->k(Ljava/lang/Object;Lxa/Q;I)Z

    move-result v0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_3

    if-eqz v0, :cond_8

    goto :goto_3

    .line 15
    :cond_8
    :goto_7
    iget v0, v9, Lxa/G;->k:I

    move-object v4, v5

    :goto_8
    iget v1, v9, Lxa/G;->l:I

    if-ge v0, v1, :cond_9

    .line 16
    iget-object v1, v9, Lxa/G;->j:[I

    aget v3, v1, v0

    move-object/from16 v6, p3

    move-object/from16 v5, p1

    move-object v1, v9

    .line 17
    invoke-direct/range {v1 .. v6}, Lxa/G;->k(Ljava/lang/Object;ILjava/lang/Object;Lxa/Y;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    move-object v9, v2

    move-object v6, v5

    add-int/lit8 v0, v0, 0x1

    move-object v9, v1

    goto :goto_8

    :cond_9
    move-object v1, v9

    move-object v9, v2

    if-eqz v4, :cond_13

    .line 18
    invoke-virtual {v6, v9, v4}, Lxa/Y;->m(Ljava/lang/Object;Ljava/lang/Object;)V

    goto/16 :goto_25

    :catchall_3
    move-exception v0

    move-object v1, v9

    move-object v9, v2

    goto/16 :goto_27

    :catchall_4
    move-exception v0

    move-object v1, v9

    move-object v9, v2

    goto :goto_5

    :catchall_5
    move-exception v0

    move-object v10, v9

    move-object v9, v1

    move-object v1, v10

    move-object v10, v5

    move-object v2, v9

    goto/16 :goto_27

    :cond_a
    move-object/from16 v6, p1

    move-object/from16 v9, p3

    move-object v7, v4

    move-object v10, v5

    move-object/from16 v4, p4

    .line 19
    :try_start_7
    invoke-direct {v1, v3}, Lxa/G;->c0(I)I

    move-result v5
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_6

    .line 20
    :try_start_8
    invoke-static {v5}, Lxa/G;->b0(I)I

    move-result v11
    :try_end_8
    .catch Lxa/r$a; {:try_start_8 .. :try_end_8} :catch_f
    .catchall {:try_start_8 .. :try_end_8} :catchall_14

    packed-switch v11, :pswitch_data_0

    if-nez v10, :cond_b

    .line 21
    :try_start_9
    invoke-virtual {v6, v9}, Lxa/Y;->f(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5
    :try_end_9
    .catch Lxa/r$a; {:try_start_9 .. :try_end_9} :catch_0
    .catchall {:try_start_9 .. :try_end_9} :catchall_6

    goto :goto_9

    :catchall_6
    move-exception v0

    move-object v2, v9

    goto :goto_5

    :catch_0
    move-object v2, v9

    move-object v5, v10

    move-object v9, v6

    goto/16 :goto_20

    :cond_b
    move-object v5, v10

    .line 22
    :goto_9
    :try_start_a
    invoke-virtual {v6, v5, v4, v0}, Lxa/Y;->k(Ljava/lang/Object;Lxa/Q;I)Z

    move-result v0
    :try_end_a
    .catch Lxa/r$a; {:try_start_a .. :try_end_a} :catch_1
    .catchall {:try_start_a .. :try_end_a} :catchall_7

    if-nez v0, :cond_d

    .line 23
    iget v0, v1, Lxa/G;->k:I

    move-object v4, v5

    :goto_a
    iget v2, v1, Lxa/G;->l:I

    if-ge v0, v2, :cond_c

    .line 24
    iget-object v2, v1, Lxa/G;->j:[I

    aget v3, v2, v0

    move-object/from16 v6, p3

    move-object/from16 v5, p1

    move-object v2, v9

    .line 25
    invoke-direct/range {v1 .. v6}, Lxa/G;->k(Ljava/lang/Object;ILjava/lang/Object;Lxa/Y;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    move-object v6, v2

    move-object v9, v5

    add-int/lit8 v0, v0, 0x1

    move-object v15, v9

    move-object v9, v6

    move-object v6, v15

    goto :goto_a

    :cond_c
    move-object v15, v9

    move-object v9, v6

    move-object v6, v15

    if-eqz v4, :cond_13

    .line 26
    invoke-virtual {v9, v6, v4}, Lxa/Y;->m(Ljava/lang/Object;Ljava/lang/Object;)V

    goto/16 :goto_25

    :cond_d
    move-object v15, v9

    move-object v9, v6

    move-object v6, v15

    move-object v2, v6

    goto/16 :goto_1f

    :catchall_7
    move-exception v0

    move-object v15, v9

    move-object v9, v6

    move-object v6, v15

    move-object v2, v6

    :goto_b
    move-object v6, v9

    goto/16 :goto_27

    :catch_1
    move-object v15, v9

    move-object v9, v6

    move-object v6, v15

    move-object v2, v6

    goto/16 :goto_20

    :pswitch_0
    move-object v15, v9

    move-object v9, v6

    move-object v6, v15

    .line 27
    :try_start_b
    invoke-direct {v1, v6, v2, v3}, Lxa/G;->E(Ljava/lang/Object;II)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lxa/D;

    .line 28
    invoke-direct {v1, v3}, Lxa/G;->n(I)Lxa/S;

    move-result-object v11

    .line 29
    invoke-interface {v4, v5, v11, v7}, Lxa/Q;->K(Ljava/lang/Object;Lxa/S;Lxa/j;)V

    .line 30
    invoke-direct {v1, v6, v2, v3, v5}, Lxa/G;->a0(Ljava/lang/Object;IILjava/lang/Object;)V

    :goto_c
    move-object v2, v6

    goto/16 :goto_1e

    :catchall_8
    move-exception v0

    move-object v2, v6

    :goto_d
    move-object v6, v9

    goto/16 :goto_5

    :catch_2
    move-object v2, v6

    :catch_3
    :goto_e
    move-object v5, v10

    goto/16 :goto_20

    :pswitch_1
    move-object v15, v9

    move-object v9, v6

    move-object v6, v15

    .line 31
    invoke-static {v5}, Lxa/G;->J(I)J

    move-result-wide v11

    invoke-interface {v4}, Lxa/Q;->y()J

    move-result-wide v13

    invoke-static {v13, v14}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v5

    .line 32
    invoke-static {v6, v11, v12, v5}, Lxa/c0;->O(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 33
    invoke-direct {v1, v6, v2, v3}, Lxa/G;->X(Ljava/lang/Object;II)V

    goto :goto_c

    :pswitch_2
    move-object v15, v9

    move-object v9, v6

    move-object v6, v15

    .line 34
    invoke-static {v5}, Lxa/G;->J(I)J

    move-result-wide v11

    invoke-interface {v4}, Lxa/Q;->k()I

    move-result v5

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    .line 35
    invoke-static {v6, v11, v12, v5}, Lxa/c0;->O(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 36
    invoke-direct {v1, v6, v2, v3}, Lxa/G;->X(Ljava/lang/Object;II)V

    goto :goto_c

    :pswitch_3
    move-object v15, v9

    move-object v9, v6

    move-object v6, v15

    .line 37
    invoke-static {v5}, Lxa/G;->J(I)J

    move-result-wide v11

    invoke-interface {v4}, Lxa/Q;->e()J

    move-result-wide v13

    invoke-static {v13, v14}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v5

    .line 38
    invoke-static {v6, v11, v12, v5}, Lxa/c0;->O(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 39
    invoke-direct {v1, v6, v2, v3}, Lxa/G;->X(Ljava/lang/Object;II)V

    goto :goto_c

    :pswitch_4
    move-object v15, v9

    move-object v9, v6

    move-object v6, v15

    .line 40
    invoke-static {v5}, Lxa/G;->J(I)J

    move-result-wide v11

    invoke-interface {v4}, Lxa/Q;->E()I

    move-result v5

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    .line 41
    invoke-static {v6, v11, v12, v5}, Lxa/c0;->O(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 42
    invoke-direct {v1, v6, v2, v3}, Lxa/G;->X(Ljava/lang/Object;II)V

    goto :goto_c

    :pswitch_5
    move-object v15, v9

    move-object v9, v6

    move-object v6, v15

    .line 43
    invoke-interface {v4}, Lxa/Q;->j()I

    move-result v11

    .line 44
    invoke-direct {v1, v3}, Lxa/G;->l(I)Lxa/q$a;

    .line 45
    invoke-static {v5}, Lxa/G;->J(I)J

    move-result-wide v12

    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-static {v6, v12, v13, v5}, Lxa/c0;->O(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 46
    invoke-direct {v1, v6, v2, v3}, Lxa/G;->X(Ljava/lang/Object;II)V

    goto :goto_c

    :pswitch_6
    move-object v15, v9

    move-object v9, v6

    move-object v6, v15

    .line 47
    invoke-static {v5}, Lxa/G;->J(I)J

    move-result-wide v11

    invoke-interface {v4}, Lxa/Q;->g()I

    move-result v5

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    .line 48
    invoke-static {v6, v11, v12, v5}, Lxa/c0;->O(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 49
    invoke-direct {v1, v6, v2, v3}, Lxa/G;->X(Ljava/lang/Object;II)V

    goto/16 :goto_c

    :pswitch_7
    move-object v15, v9

    move-object v9, v6

    move-object v6, v15

    .line 50
    invoke-static {v5}, Lxa/G;->J(I)J

    move-result-wide v11

    invoke-interface {v4}, Lxa/Q;->n()Lxa/e;

    move-result-object v5

    invoke-static {v6, v11, v12, v5}, Lxa/c0;->O(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 51
    invoke-direct {v1, v6, v2, v3}, Lxa/G;->X(Ljava/lang/Object;II)V

    goto/16 :goto_c

    :pswitch_8
    move-object v15, v9

    move-object v9, v6

    move-object v6, v15

    .line 52
    invoke-direct {v1, v6, v2, v3}, Lxa/G;->E(Ljava/lang/Object;II)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lxa/D;

    .line 53
    invoke-direct {v1, v3}, Lxa/G;->n(I)Lxa/S;

    move-result-object v11

    .line 54
    invoke-interface {v4, v5, v11, v7}, Lxa/Q;->L(Ljava/lang/Object;Lxa/S;Lxa/j;)V

    .line 55
    invoke-direct {v1, v6, v2, v3, v5}, Lxa/G;->a0(Ljava/lang/Object;IILjava/lang/Object;)V

    goto/16 :goto_c

    :pswitch_9
    move-object v15, v9

    move-object v9, v6

    move-object v6, v15

    .line 56
    invoke-direct {v1, v6, v5, v4}, Lxa/G;->T(Ljava/lang/Object;ILxa/Q;)V

    .line 57
    invoke-direct {v1, v6, v2, v3}, Lxa/G;->X(Ljava/lang/Object;II)V

    goto/16 :goto_c

    :pswitch_a
    move-object v15, v9

    move-object v9, v6

    move-object v6, v15

    .line 58
    invoke-static {v5}, Lxa/G;->J(I)J

    move-result-wide v11

    invoke-interface {v4}, Lxa/Q;->d()Z

    move-result v5

    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v5

    .line 59
    invoke-static {v6, v11, v12, v5}, Lxa/c0;->O(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 60
    invoke-direct {v1, v6, v2, v3}, Lxa/G;->X(Ljava/lang/Object;II)V

    goto/16 :goto_c

    :pswitch_b
    move-object v15, v9

    move-object v9, v6

    move-object v6, v15

    .line 61
    invoke-static {v5}, Lxa/G;->J(I)J

    move-result-wide v11

    invoke-interface {v4}, Lxa/Q;->u()I

    move-result v5

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    .line 62
    invoke-static {v6, v11, v12, v5}, Lxa/c0;->O(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 63
    invoke-direct {v1, v6, v2, v3}, Lxa/G;->X(Ljava/lang/Object;II)V

    goto/16 :goto_c

    :pswitch_c
    move-object v15, v9

    move-object v9, v6

    move-object v6, v15

    .line 64
    invoke-static {v5}, Lxa/G;->J(I)J

    move-result-wide v11

    invoke-interface {v4}, Lxa/Q;->a()J

    move-result-wide v13

    invoke-static {v13, v14}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v5

    .line 65
    invoke-static {v6, v11, v12, v5}, Lxa/c0;->O(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 66
    invoke-direct {v1, v6, v2, v3}, Lxa/G;->X(Ljava/lang/Object;II)V

    goto/16 :goto_c

    :pswitch_d
    move-object v15, v9

    move-object v9, v6

    move-object v6, v15

    .line 67
    invoke-static {v5}, Lxa/G;->J(I)J

    move-result-wide v11

    invoke-interface {v4}, Lxa/Q;->o()I

    move-result v5

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    .line 68
    invoke-static {v6, v11, v12, v5}, Lxa/c0;->O(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 69
    invoke-direct {v1, v6, v2, v3}, Lxa/G;->X(Ljava/lang/Object;II)V

    goto/16 :goto_c

    :pswitch_e
    move-object v15, v9

    move-object v9, v6

    move-object v6, v15

    .line 70
    invoke-static {v5}, Lxa/G;->J(I)J

    move-result-wide v11

    invoke-interface {v4}, Lxa/Q;->s()J

    move-result-wide v13

    invoke-static {v13, v14}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v5

    .line 71
    invoke-static {v6, v11, v12, v5}, Lxa/c0;->O(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 72
    invoke-direct {v1, v6, v2, v3}, Lxa/G;->X(Ljava/lang/Object;II)V

    goto/16 :goto_c

    :pswitch_f
    move-object v15, v9

    move-object v9, v6

    move-object v6, v15

    .line 73
    invoke-static {v5}, Lxa/G;->J(I)J

    move-result-wide v11

    invoke-interface {v4}, Lxa/Q;->H()J

    move-result-wide v13

    invoke-static {v13, v14}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v5

    .line 74
    invoke-static {v6, v11, v12, v5}, Lxa/c0;->O(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 75
    invoke-direct {v1, v6, v2, v3}, Lxa/G;->X(Ljava/lang/Object;II)V

    goto/16 :goto_c

    :pswitch_10
    move-object v15, v9

    move-object v9, v6

    move-object v6, v15

    .line 76
    invoke-static {v5}, Lxa/G;->J(I)J

    move-result-wide v11

    invoke-interface {v4}, Lxa/Q;->readFloat()F

    move-result v5

    invoke-static {v5}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v5

    .line 77
    invoke-static {v6, v11, v12, v5}, Lxa/c0;->O(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 78
    invoke-direct {v1, v6, v2, v3}, Lxa/G;->X(Ljava/lang/Object;II)V

    goto/16 :goto_c

    :pswitch_11
    move-object v15, v9

    move-object v9, v6

    move-object v6, v15

    .line 79
    invoke-static {v5}, Lxa/G;->J(I)J

    move-result-wide v11

    invoke-interface {v4}, Lxa/Q;->readDouble()D

    move-result-wide v13

    invoke-static {v13, v14}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v5

    .line 80
    invoke-static {v6, v11, v12, v5}, Lxa/c0;->O(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 81
    invoke-direct {v1, v6, v2, v3}, Lxa/G;->X(Ljava/lang/Object;II)V
    :try_end_b
    .catch Lxa/r$a; {:try_start_b .. :try_end_b} :catch_2
    .catchall {:try_start_b .. :try_end_b} :catchall_8

    goto/16 :goto_c

    :pswitch_12
    move-object v15, v9

    move-object v9, v6

    move-object v6, v15

    .line 82
    :try_start_c
    invoke-direct {v1, v3}, Lxa/G;->m(I)Ljava/lang/Object;

    move-result-object v4

    move-object v2, v6

    move-object v5, v7

    move-object/from16 v6, p4

    invoke-direct/range {v1 .. v6}, Lxa/G;->z(Ljava/lang/Object;ILjava/lang/Object;Lxa/j;Lxa/Q;)V
    :try_end_c
    .catch Lxa/r$a; {:try_start_c .. :try_end_c} :catch_4
    .catchall {:try_start_c .. :try_end_c} :catchall_9

    move-object/from16 v2, p3

    move-object/from16 v4, p4

    :goto_f
    move-object/from16 v7, p5

    goto/16 :goto_1e

    :catchall_9
    move-exception v0

    move-object/from16 v2, p3

    goto/16 :goto_d

    :catch_4
    move-object/from16 v2, p3

    move-object/from16 v4, p4

    :goto_10
    move-object/from16 v7, p5

    goto/16 :goto_e

    :pswitch_13
    move-object v9, v6

    .line 83
    :try_start_d
    invoke-static {v5}, Lxa/G;->J(I)J

    move-result-wide v4

    .line 84
    invoke-direct {v1, v3}, Lxa/G;->n(I)Lxa/S;

    move-result-object v6
    :try_end_d
    .catch Lxa/r$a; {:try_start_d .. :try_end_d} :catch_4
    .catchall {:try_start_d .. :try_end_d} :catchall_b

    move-object/from16 v2, p3

    move-object/from16 v7, p5

    move-wide v3, v4

    move-object/from16 v5, p4

    .line 85
    :try_start_e
    invoke-direct/range {v1 .. v7}, Lxa/G;->R(Ljava/lang/Object;JLxa/Q;Lxa/S;Lxa/j;)V
    :try_end_e
    .catch Lxa/r$a; {:try_start_e .. :try_end_e} :catch_5
    .catchall {:try_start_e .. :try_end_e} :catchall_a

    move-object v7, v1

    move-object v1, v2

    move-object v11, v5

    :goto_11
    move-object v2, v1

    :goto_12
    move-object v1, v7

    move-object v4, v11

    goto :goto_f

    :catchall_a
    move-exception v0

    move-object v7, v1

    move-object v1, v2

    :goto_13
    move-object v1, v7

    goto/16 :goto_d

    :catch_5
    move-object/from16 v7, p5

    move-object v4, v5

    goto/16 :goto_e

    :catchall_b
    move-exception v0

    move-object v7, v1

    move-object/from16 v1, p3

    :goto_14
    move-object v2, v1

    goto :goto_13

    :pswitch_14
    move-object v7, v1

    move-object v11, v4

    move-object v1, v9

    move-object v9, v6

    .line 86
    :try_start_f
    iget-object v2, v7, Lxa/G;->n:Lxa/u;

    .line 87
    invoke-static {v5}, Lxa/G;->J(I)J

    move-result-wide v3

    invoke-virtual {v2, v1, v3, v4}, Lxa/u;->e(Ljava/lang/Object;J)Ljava/util/List;

    move-result-object v2

    .line 88
    invoke-interface {v11, v2}, Lxa/Q;->c(Ljava/util/List;)V

    goto :goto_11

    :catchall_c
    move-exception v0

    goto :goto_14

    :catch_6
    move-object v2, v1

    :catch_7
    :goto_15
    move-object v1, v7

    move-object v5, v10

    :goto_16
    move-object v4, v11

    move-object/from16 v7, p5

    goto/16 :goto_20

    :pswitch_15
    move-object v7, v1

    move-object v11, v4

    move-object v1, v9

    move-object v9, v6

    .line 89
    iget-object v2, v7, Lxa/G;->n:Lxa/u;

    .line 90
    invoke-static {v5}, Lxa/G;->J(I)J

    move-result-wide v3

    invoke-virtual {v2, v1, v3, v4}, Lxa/u;->e(Ljava/lang/Object;J)Ljava/util/List;

    move-result-object v2

    .line 91
    invoke-interface {v11, v2}, Lxa/Q;->r(Ljava/util/List;)V

    goto :goto_11

    :pswitch_16
    move-object v7, v1

    move-object v11, v4

    move-object v1, v9

    move-object v9, v6

    .line 92
    iget-object v2, v7, Lxa/G;->n:Lxa/u;

    .line 93
    invoke-static {v5}, Lxa/G;->J(I)J

    move-result-wide v3

    invoke-virtual {v2, v1, v3, v4}, Lxa/u;->e(Ljava/lang/Object;J)Ljava/util/List;

    move-result-object v2

    .line 94
    invoke-interface {v11, v2}, Lxa/Q;->v(Ljava/util/List;)V

    goto :goto_11

    :pswitch_17
    move-object v7, v1

    move-object v11, v4

    move-object v1, v9

    move-object v9, v6

    .line 95
    iget-object v2, v7, Lxa/G;->n:Lxa/u;

    .line 96
    invoke-static {v5}, Lxa/G;->J(I)J

    move-result-wide v3

    invoke-virtual {v2, v1, v3, v4}, Lxa/u;->e(Ljava/lang/Object;J)Ljava/util/List;

    move-result-object v2

    .line 97
    invoke-interface {v11, v2}, Lxa/Q;->b(Ljava/util/List;)V
    :try_end_f
    .catch Lxa/r$a; {:try_start_f .. :try_end_f} :catch_6
    .catchall {:try_start_f .. :try_end_f} :catchall_c

    goto :goto_11

    :pswitch_18
    move-object v7, v1

    move-object v11, v4

    move-object v1, v9

    move-object v9, v6

    .line 98
    :try_start_10
    iget-object v4, v7, Lxa/G;->n:Lxa/u;

    .line 99
    invoke-static {v5}, Lxa/G;->J(I)J

    move-result-wide v5

    invoke-virtual {v4, v1, v5, v6}, Lxa/u;->e(Ljava/lang/Object;J)Ljava/util/List;

    move-result-object v4

    .line 100
    invoke-interface {v11, v4}, Lxa/Q;->i(Ljava/util/List;)V

    .line 101
    invoke-direct {v7, v3}, Lxa/G;->l(I)Lxa/q$a;
    :try_end_10
    .catch Lxa/r$a; {:try_start_10 .. :try_end_10} :catch_9
    .catchall {:try_start_10 .. :try_end_10} :catchall_e

    move-object v3, v4

    const/4 v4, 0x0

    move-object v6, v9

    move-object v5, v10

    .line 102
    :try_start_11
    invoke-static/range {v1 .. v6}, Lxa/U;->a(Ljava/lang/Object;ILjava/util/List;Lxa/q$a;Ljava/lang/Object;Lxa/Y;)Ljava/lang/Object;

    move-result-object v5
    :try_end_11
    .catch Lxa/r$a; {:try_start_11 .. :try_end_11} :catch_8
    .catchall {:try_start_11 .. :try_end_11} :catchall_d

    move-object v2, v1

    move-object/from16 v9, p1

    :goto_17
    move-object v1, v7

    move-object v4, v11

    move-object/from16 v7, p5

    goto/16 :goto_1f

    :catchall_d
    move-exception v0

    move-object v2, v1

    move-object v6, v5

    :goto_18
    move-object v1, v7

    move-object/from16 v6, p1

    goto/16 :goto_27

    :catch_8
    move-object v6, v5

    move-object/from16 v9, p1

    :goto_19
    move-object v2, v1

    :goto_1a
    move-object v1, v7

    goto :goto_16

    :catchall_e
    move-exception v0

    move-object v2, v1

    move-object v6, v10

    :goto_1b
    move-object v5, v6

    goto :goto_18

    :catch_9
    move-object v6, v10

    move-object/from16 v9, p1

    move-object v2, v1

    :goto_1c
    move-object v5, v6

    goto :goto_1a

    :pswitch_19
    move-object v7, v1

    move-object v11, v4

    move-object v2, v9

    move-object v6, v10

    .line 103
    :try_start_12
    iget-object v1, v7, Lxa/G;->n:Lxa/u;

    .line 104
    invoke-static {v5}, Lxa/G;->J(I)J

    move-result-wide v3

    invoke-virtual {v1, v2, v3, v4}, Lxa/u;->e(Ljava/lang/Object;J)Ljava/util/List;

    move-result-object v1

    .line 105
    invoke-interface {v11, v1}, Lxa/Q;->t(Ljava/util/List;)V

    :goto_1d
    move-object/from16 v9, p1

    move-object v10, v6

    goto/16 :goto_12

    :catchall_f
    move-exception v0

    goto :goto_1b

    :catch_a
    move-object/from16 v9, p1

    goto :goto_1c

    :pswitch_1a
    move-object v7, v1

    move-object v11, v4

    move-object v2, v9

    move-object v6, v10

    .line 106
    iget-object v1, v7, Lxa/G;->n:Lxa/u;

    .line 107
    invoke-static {v5}, Lxa/G;->J(I)J

    move-result-wide v3

    invoke-virtual {v1, v2, v3, v4}, Lxa/u;->e(Ljava/lang/Object;J)Ljava/util/List;

    move-result-object v1

    .line 108
    invoke-interface {v11, v1}, Lxa/Q;->l(Ljava/util/List;)V

    goto :goto_1d

    :pswitch_1b
    move-object v7, v1

    move-object v11, v4

    move-object v2, v9

    move-object v6, v10

    .line 109
    iget-object v1, v7, Lxa/G;->n:Lxa/u;

    .line 110
    invoke-static {v5}, Lxa/G;->J(I)J

    move-result-wide v3

    invoke-virtual {v1, v2, v3, v4}, Lxa/u;->e(Ljava/lang/Object;J)Ljava/util/List;

    move-result-object v1

    .line 111
    invoke-interface {v11, v1}, Lxa/Q;->x(Ljava/util/List;)V

    goto :goto_1d

    :pswitch_1c
    move-object v7, v1

    move-object v11, v4

    move-object v2, v9

    move-object v6, v10

    .line 112
    iget-object v1, v7, Lxa/G;->n:Lxa/u;

    .line 113
    invoke-static {v5}, Lxa/G;->J(I)J

    move-result-wide v3

    invoke-virtual {v1, v2, v3, v4}, Lxa/u;->e(Ljava/lang/Object;J)Ljava/util/List;

    move-result-object v1

    .line 114
    invoke-interface {v11, v1}, Lxa/Q;->p(Ljava/util/List;)V

    goto :goto_1d

    :pswitch_1d
    move-object v7, v1

    move-object v11, v4

    move-object v2, v9

    move-object v6, v10

    .line 115
    iget-object v1, v7, Lxa/G;->n:Lxa/u;

    .line 116
    invoke-static {v5}, Lxa/G;->J(I)J

    move-result-wide v3

    invoke-virtual {v1, v2, v3, v4}, Lxa/u;->e(Ljava/lang/Object;J)Ljava/util/List;

    move-result-object v1

    .line 117
    invoke-interface {v11, v1}, Lxa/Q;->w(Ljava/util/List;)V

    goto :goto_1d

    :pswitch_1e
    move-object v7, v1

    move-object v11, v4

    move-object v2, v9

    move-object v6, v10

    .line 118
    iget-object v1, v7, Lxa/G;->n:Lxa/u;

    .line 119
    invoke-static {v5}, Lxa/G;->J(I)J

    move-result-wide v3

    invoke-virtual {v1, v2, v3, v4}, Lxa/u;->e(Ljava/lang/Object;J)Ljava/util/List;

    move-result-object v1

    .line 120
    invoke-interface {v11, v1}, Lxa/Q;->f(Ljava/util/List;)V

    goto :goto_1d

    :pswitch_1f
    move-object v7, v1

    move-object v11, v4

    move-object v2, v9

    move-object v6, v10

    .line 121
    iget-object v1, v7, Lxa/G;->n:Lxa/u;

    .line 122
    invoke-static {v5}, Lxa/G;->J(I)J

    move-result-wide v3

    invoke-virtual {v1, v2, v3, v4}, Lxa/u;->e(Ljava/lang/Object;J)Ljava/util/List;

    move-result-object v1

    .line 123
    invoke-interface {v11, v1}, Lxa/Q;->h(Ljava/util/List;)V

    goto :goto_1d

    :pswitch_20
    move-object v7, v1

    move-object v11, v4

    move-object v2, v9

    move-object v6, v10

    .line 124
    iget-object v1, v7, Lxa/G;->n:Lxa/u;

    .line 125
    invoke-static {v5}, Lxa/G;->J(I)J

    move-result-wide v3

    invoke-virtual {v1, v2, v3, v4}, Lxa/u;->e(Ljava/lang/Object;J)Ljava/util/List;

    move-result-object v1

    .line 126
    invoke-interface {v11, v1}, Lxa/Q;->C(Ljava/util/List;)V

    goto/16 :goto_1d

    :pswitch_21
    move-object v7, v1

    move-object v11, v4

    move-object v2, v9

    move-object v6, v10

    .line 127
    iget-object v1, v7, Lxa/G;->n:Lxa/u;

    .line 128
    invoke-static {v5}, Lxa/G;->J(I)J

    move-result-wide v3

    invoke-virtual {v1, v2, v3, v4}, Lxa/u;->e(Ljava/lang/Object;J)Ljava/util/List;

    move-result-object v1

    .line 129
    invoke-interface {v11, v1}, Lxa/Q;->G(Ljava/util/List;)V

    goto/16 :goto_1d

    :pswitch_22
    move-object v7, v1

    move-object v11, v4

    move-object v2, v9

    move-object v6, v10

    .line 130
    iget-object v1, v7, Lxa/G;->n:Lxa/u;

    .line 131
    invoke-static {v5}, Lxa/G;->J(I)J

    move-result-wide v3

    invoke-virtual {v1, v2, v3, v4}, Lxa/u;->e(Ljava/lang/Object;J)Ljava/util/List;

    move-result-object v1

    .line 132
    invoke-interface {v11, v1}, Lxa/Q;->c(Ljava/util/List;)V

    goto/16 :goto_1d

    :pswitch_23
    move-object v7, v1

    move-object v11, v4

    move-object v2, v9

    move-object v6, v10

    .line 133
    iget-object v1, v7, Lxa/G;->n:Lxa/u;

    .line 134
    invoke-static {v5}, Lxa/G;->J(I)J

    move-result-wide v3

    invoke-virtual {v1, v2, v3, v4}, Lxa/u;->e(Ljava/lang/Object;J)Ljava/util/List;

    move-result-object v1

    .line 135
    invoke-interface {v11, v1}, Lxa/Q;->r(Ljava/util/List;)V

    goto/16 :goto_1d

    :pswitch_24
    move-object v7, v1

    move-object v11, v4

    move-object v2, v9

    move-object v6, v10

    .line 136
    iget-object v1, v7, Lxa/G;->n:Lxa/u;

    .line 137
    invoke-static {v5}, Lxa/G;->J(I)J

    move-result-wide v3

    invoke-virtual {v1, v2, v3, v4}, Lxa/u;->e(Ljava/lang/Object;J)Ljava/util/List;

    move-result-object v1

    .line 138
    invoke-interface {v11, v1}, Lxa/Q;->v(Ljava/util/List;)V

    goto/16 :goto_1d

    :pswitch_25
    move-object v7, v1

    move-object v11, v4

    move-object v2, v9

    move-object v6, v10

    .line 139
    iget-object v1, v7, Lxa/G;->n:Lxa/u;

    .line 140
    invoke-static {v5}, Lxa/G;->J(I)J

    move-result-wide v3

    invoke-virtual {v1, v2, v3, v4}, Lxa/u;->e(Ljava/lang/Object;J)Ljava/util/List;

    move-result-object v1

    .line 141
    invoke-interface {v11, v1}, Lxa/Q;->b(Ljava/util/List;)V
    :try_end_12
    .catch Lxa/r$a; {:try_start_12 .. :try_end_12} :catch_a
    .catchall {:try_start_12 .. :try_end_12} :catchall_f

    goto/16 :goto_1d

    :pswitch_26
    move-object v7, v1

    move v1, v2

    move-object v11, v4

    move-object v2, v9

    move-object v6, v10

    .line 142
    :try_start_13
    iget-object v4, v7, Lxa/G;->n:Lxa/u;

    .line 143
    invoke-static {v5}, Lxa/G;->J(I)J

    move-result-wide v9

    invoke-virtual {v4, v2, v9, v10}, Lxa/u;->e(Ljava/lang/Object;J)Ljava/util/List;

    move-result-object v4

    .line 144
    invoke-interface {v11, v4}, Lxa/Q;->i(Ljava/util/List;)V

    .line 145
    invoke-direct {v7, v3}, Lxa/G;->l(I)Lxa/q$a;
    :try_end_13
    .catch Lxa/r$a; {:try_start_13 .. :try_end_13} :catch_c
    .catchall {:try_start_13 .. :try_end_13} :catchall_11

    move-object v3, v4

    const/4 v4, 0x0

    move-object v5, v2

    move v2, v1

    move-object v1, v5

    move-object v5, v6

    move-object/from16 v6, p1

    .line 146
    :try_start_14
    invoke-static/range {v1 .. v6}, Lxa/U;->a(Ljava/lang/Object;ILjava/util/List;Lxa/q$a;Ljava/lang/Object;Lxa/Y;)Ljava/lang/Object;

    move-result-object v5
    :try_end_14
    .catch Lxa/r$a; {:try_start_14 .. :try_end_14} :catch_b
    .catchall {:try_start_14 .. :try_end_14} :catchall_10

    move-object v2, v1

    move-object v9, v6

    goto/16 :goto_17

    :catchall_10
    move-exception v0

    move-object v2, v1

    move-object v10, v5

    move-object v9, v6

    move-object v1, v7

    goto/16 :goto_27

    :catch_b
    move-object v10, v5

    move-object v9, v6

    goto/16 :goto_19

    :catchall_11
    move-exception v0

    move-object/from16 v9, p1

    move-object v10, v6

    goto/16 :goto_13

    :catch_c
    move-object/from16 v9, p1

    move-object v10, v6

    goto/16 :goto_15

    :pswitch_27
    move-object v7, v1

    move-object v11, v4

    move-object v2, v9

    move-object v9, v6

    .line 147
    :try_start_15
    iget-object v1, v7, Lxa/G;->n:Lxa/u;

    .line 148
    invoke-static {v5}, Lxa/G;->J(I)J

    move-result-wide v3

    invoke-virtual {v1, v2, v3, v4}, Lxa/u;->e(Ljava/lang/Object;J)Ljava/util/List;

    move-result-object v1

    .line 149
    invoke-interface {v11, v1}, Lxa/Q;->t(Ljava/util/List;)V

    goto/16 :goto_12

    :catchall_12
    move-exception v0

    goto/16 :goto_13

    :pswitch_28
    move-object v7, v1

    move-object v11, v4

    move-object v2, v9

    move-object v9, v6

    .line 150
    iget-object v1, v7, Lxa/G;->n:Lxa/u;

    .line 151
    invoke-static {v5}, Lxa/G;->J(I)J

    move-result-wide v3

    invoke-virtual {v1, v2, v3, v4}, Lxa/u;->e(Ljava/lang/Object;J)Ljava/util/List;

    move-result-object v1

    .line 152
    invoke-interface {v11, v1}, Lxa/Q;->F(Ljava/util/List;)V
    :try_end_15
    .catch Lxa/r$a; {:try_start_15 .. :try_end_15} :catch_7
    .catchall {:try_start_15 .. :try_end_15} :catchall_12

    goto/16 :goto_12

    :pswitch_29
    move-object v7, v1

    move-object v11, v4

    move v1, v5

    move-object v2, v9

    move-object v9, v6

    .line 153
    :try_start_16
    invoke-direct {v7, v3}, Lxa/G;->n(I)Lxa/S;

    move-result-object v5
    :try_end_16
    .catch Lxa/r$a; {:try_start_16 .. :try_end_16} :catch_e
    .catchall {:try_start_16 .. :try_end_16} :catchall_12

    move-object/from16 v6, p5

    move v3, v1

    move-object v1, v7

    .line 154
    :try_start_17
    invoke-direct/range {v1 .. v6}, Lxa/G;->S(Ljava/lang/Object;ILxa/Q;Lxa/S;Lxa/j;)V
    :try_end_17
    .catch Lxa/r$a; {:try_start_17 .. :try_end_17} :catch_d
    .catchall {:try_start_17 .. :try_end_17} :catchall_13

    move-object v7, v6

    goto/16 :goto_1e

    :catchall_13
    move-exception v0

    goto/16 :goto_d

    :catch_d
    move-object v7, v6

    goto/16 :goto_e

    :catch_e
    move-object v1, v7

    move-object v4, v11

    goto/16 :goto_10

    :pswitch_2a
    move-object v2, v9

    move-object v9, v6

    .line 155
    :try_start_18
    invoke-direct {v1, v2, v5, v4}, Lxa/G;->U(Ljava/lang/Object;ILxa/Q;)V

    goto/16 :goto_1e

    :pswitch_2b
    move-object v2, v9

    move-object v9, v6

    .line 156
    iget-object v3, v1, Lxa/G;->n:Lxa/u;

    .line 157
    invoke-static {v5}, Lxa/G;->J(I)J

    move-result-wide v5

    invoke-virtual {v3, v2, v5, v6}, Lxa/u;->e(Ljava/lang/Object;J)Ljava/util/List;

    move-result-object v3

    .line 158
    invoke-interface {v4, v3}, Lxa/Q;->l(Ljava/util/List;)V

    goto/16 :goto_1e

    :pswitch_2c
    move-object v2, v9

    move-object v9, v6

    .line 159
    iget-object v3, v1, Lxa/G;->n:Lxa/u;

    .line 160
    invoke-static {v5}, Lxa/G;->J(I)J

    move-result-wide v5

    invoke-virtual {v3, v2, v5, v6}, Lxa/u;->e(Ljava/lang/Object;J)Ljava/util/List;

    move-result-object v3

    .line 161
    invoke-interface {v4, v3}, Lxa/Q;->x(Ljava/util/List;)V

    goto/16 :goto_1e

    :pswitch_2d
    move-object v2, v9

    move-object v9, v6

    .line 162
    iget-object v3, v1, Lxa/G;->n:Lxa/u;

    .line 163
    invoke-static {v5}, Lxa/G;->J(I)J

    move-result-wide v5

    invoke-virtual {v3, v2, v5, v6}, Lxa/u;->e(Ljava/lang/Object;J)Ljava/util/List;

    move-result-object v3

    .line 164
    invoke-interface {v4, v3}, Lxa/Q;->p(Ljava/util/List;)V

    goto/16 :goto_1e

    :pswitch_2e
    move-object v2, v9

    move-object v9, v6

    .line 165
    iget-object v3, v1, Lxa/G;->n:Lxa/u;

    .line 166
    invoke-static {v5}, Lxa/G;->J(I)J

    move-result-wide v5

    invoke-virtual {v3, v2, v5, v6}, Lxa/u;->e(Ljava/lang/Object;J)Ljava/util/List;

    move-result-object v3

    .line 167
    invoke-interface {v4, v3}, Lxa/Q;->w(Ljava/util/List;)V

    goto/16 :goto_1e

    :pswitch_2f
    move-object v2, v9

    move-object v9, v6

    .line 168
    iget-object v3, v1, Lxa/G;->n:Lxa/u;

    .line 169
    invoke-static {v5}, Lxa/G;->J(I)J

    move-result-wide v5

    invoke-virtual {v3, v2, v5, v6}, Lxa/u;->e(Ljava/lang/Object;J)Ljava/util/List;

    move-result-object v3

    .line 170
    invoke-interface {v4, v3}, Lxa/Q;->f(Ljava/util/List;)V

    goto/16 :goto_1e

    :pswitch_30
    move-object v2, v9

    move-object v9, v6

    .line 171
    iget-object v3, v1, Lxa/G;->n:Lxa/u;

    .line 172
    invoke-static {v5}, Lxa/G;->J(I)J

    move-result-wide v5

    invoke-virtual {v3, v2, v5, v6}, Lxa/u;->e(Ljava/lang/Object;J)Ljava/util/List;

    move-result-object v3

    .line 173
    invoke-interface {v4, v3}, Lxa/Q;->h(Ljava/util/List;)V

    goto/16 :goto_1e

    :pswitch_31
    move-object v2, v9

    move-object v9, v6

    .line 174
    iget-object v3, v1, Lxa/G;->n:Lxa/u;

    .line 175
    invoke-static {v5}, Lxa/G;->J(I)J

    move-result-wide v5

    invoke-virtual {v3, v2, v5, v6}, Lxa/u;->e(Ljava/lang/Object;J)Ljava/util/List;

    move-result-object v3

    .line 176
    invoke-interface {v4, v3}, Lxa/Q;->C(Ljava/util/List;)V

    goto/16 :goto_1e

    :pswitch_32
    move-object v2, v9

    move-object v9, v6

    .line 177
    iget-object v3, v1, Lxa/G;->n:Lxa/u;

    .line 178
    invoke-static {v5}, Lxa/G;->J(I)J

    move-result-wide v5

    invoke-virtual {v3, v2, v5, v6}, Lxa/u;->e(Ljava/lang/Object;J)Ljava/util/List;

    move-result-object v3

    .line 179
    invoke-interface {v4, v3}, Lxa/Q;->G(Ljava/util/List;)V

    goto/16 :goto_1e

    :pswitch_33
    move-object v2, v9

    move-object v9, v6

    .line 180
    invoke-direct {v1, v2, v3}, Lxa/G;->D(Ljava/lang/Object;I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lxa/D;

    .line 181
    invoke-direct {v1, v3}, Lxa/G;->n(I)Lxa/S;

    move-result-object v6

    .line 182
    invoke-interface {v4, v5, v6, v7}, Lxa/Q;->K(Ljava/lang/Object;Lxa/S;Lxa/j;)V

    .line 183
    invoke-direct {v1, v2, v3, v5}, Lxa/G;->Z(Ljava/lang/Object;ILjava/lang/Object;)V

    goto/16 :goto_1e

    :pswitch_34
    move-object v2, v9

    move-object v9, v6

    .line 184
    invoke-static {v5}, Lxa/G;->J(I)J

    move-result-wide v5

    invoke-interface {v4}, Lxa/Q;->y()J

    move-result-wide v11

    invoke-static {v2, v5, v6, v11, v12}, Lxa/c0;->N(Ljava/lang/Object;JJ)V

    .line 185
    invoke-direct {v1, v2, v3}, Lxa/G;->W(Ljava/lang/Object;I)V

    goto/16 :goto_1e

    :pswitch_35
    move-object v2, v9

    move-object v9, v6

    .line 186
    invoke-static {v5}, Lxa/G;->J(I)J

    move-result-wide v5

    invoke-interface {v4}, Lxa/Q;->k()I

    move-result v11

    invoke-static {v2, v5, v6, v11}, Lxa/c0;->M(Ljava/lang/Object;JI)V

    .line 187
    invoke-direct {v1, v2, v3}, Lxa/G;->W(Ljava/lang/Object;I)V

    goto/16 :goto_1e

    :pswitch_36
    move-object v2, v9

    move-object v9, v6

    .line 188
    invoke-static {v5}, Lxa/G;->J(I)J

    move-result-wide v5

    invoke-interface {v4}, Lxa/Q;->e()J

    move-result-wide v11

    invoke-static {v2, v5, v6, v11, v12}, Lxa/c0;->N(Ljava/lang/Object;JJ)V

    .line 189
    invoke-direct {v1, v2, v3}, Lxa/G;->W(Ljava/lang/Object;I)V

    goto/16 :goto_1e

    :pswitch_37
    move-object v2, v9

    move-object v9, v6

    .line 190
    invoke-static {v5}, Lxa/G;->J(I)J

    move-result-wide v5

    invoke-interface {v4}, Lxa/Q;->E()I

    move-result v11

    invoke-static {v2, v5, v6, v11}, Lxa/c0;->M(Ljava/lang/Object;JI)V

    .line 191
    invoke-direct {v1, v2, v3}, Lxa/G;->W(Ljava/lang/Object;I)V

    goto/16 :goto_1e

    :pswitch_38
    move-object v2, v9

    move-object v9, v6

    .line 192
    invoke-interface {v4}, Lxa/Q;->j()I

    move-result v6

    .line 193
    invoke-direct {v1, v3}, Lxa/G;->l(I)Lxa/q$a;

    .line 194
    invoke-static {v5}, Lxa/G;->J(I)J

    move-result-wide v11

    invoke-static {v2, v11, v12, v6}, Lxa/c0;->M(Ljava/lang/Object;JI)V

    .line 195
    invoke-direct {v1, v2, v3}, Lxa/G;->W(Ljava/lang/Object;I)V

    goto/16 :goto_1e

    :pswitch_39
    move-object v2, v9

    move-object v9, v6

    .line 196
    invoke-static {v5}, Lxa/G;->J(I)J

    move-result-wide v5

    invoke-interface {v4}, Lxa/Q;->g()I

    move-result v11

    invoke-static {v2, v5, v6, v11}, Lxa/c0;->M(Ljava/lang/Object;JI)V

    .line 197
    invoke-direct {v1, v2, v3}, Lxa/G;->W(Ljava/lang/Object;I)V

    goto/16 :goto_1e

    :pswitch_3a
    move-object v2, v9

    move-object v9, v6

    .line 198
    invoke-static {v5}, Lxa/G;->J(I)J

    move-result-wide v5

    invoke-interface {v4}, Lxa/Q;->n()Lxa/e;

    move-result-object v11

    invoke-static {v2, v5, v6, v11}, Lxa/c0;->O(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 199
    invoke-direct {v1, v2, v3}, Lxa/G;->W(Ljava/lang/Object;I)V

    goto/16 :goto_1e

    :pswitch_3b
    move-object v2, v9

    move-object v9, v6

    .line 200
    invoke-direct {v1, v2, v3}, Lxa/G;->D(Ljava/lang/Object;I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lxa/D;

    .line 201
    invoke-direct {v1, v3}, Lxa/G;->n(I)Lxa/S;

    move-result-object v6

    .line 202
    invoke-interface {v4, v5, v6, v7}, Lxa/Q;->L(Ljava/lang/Object;Lxa/S;Lxa/j;)V

    .line 203
    invoke-direct {v1, v2, v3, v5}, Lxa/G;->Z(Ljava/lang/Object;ILjava/lang/Object;)V

    goto/16 :goto_1e

    :pswitch_3c
    move-object v2, v9

    move-object v9, v6

    .line 204
    invoke-direct {v1, v2, v5, v4}, Lxa/G;->T(Ljava/lang/Object;ILxa/Q;)V

    .line 205
    invoke-direct {v1, v2, v3}, Lxa/G;->W(Ljava/lang/Object;I)V

    goto/16 :goto_1e

    :pswitch_3d
    move-object v2, v9

    move-object v9, v6

    .line 206
    invoke-static {v5}, Lxa/G;->J(I)J

    move-result-wide v5

    invoke-interface {v4}, Lxa/Q;->d()Z

    move-result v11

    invoke-static {v2, v5, v6, v11}, Lxa/c0;->F(Ljava/lang/Object;JZ)V

    .line 207
    invoke-direct {v1, v2, v3}, Lxa/G;->W(Ljava/lang/Object;I)V

    goto/16 :goto_1e

    :pswitch_3e
    move-object v2, v9

    move-object v9, v6

    .line 208
    invoke-static {v5}, Lxa/G;->J(I)J

    move-result-wide v5

    invoke-interface {v4}, Lxa/Q;->u()I

    move-result v11

    invoke-static {v2, v5, v6, v11}, Lxa/c0;->M(Ljava/lang/Object;JI)V

    .line 209
    invoke-direct {v1, v2, v3}, Lxa/G;->W(Ljava/lang/Object;I)V

    goto/16 :goto_1e

    :pswitch_3f
    move-object v2, v9

    move-object v9, v6

    .line 210
    invoke-static {v5}, Lxa/G;->J(I)J

    move-result-wide v5

    invoke-interface {v4}, Lxa/Q;->a()J

    move-result-wide v11

    invoke-static {v2, v5, v6, v11, v12}, Lxa/c0;->N(Ljava/lang/Object;JJ)V

    .line 211
    invoke-direct {v1, v2, v3}, Lxa/G;->W(Ljava/lang/Object;I)V

    goto :goto_1e

    :pswitch_40
    move-object v2, v9

    move-object v9, v6

    .line 212
    invoke-static {v5}, Lxa/G;->J(I)J

    move-result-wide v5

    invoke-interface {v4}, Lxa/Q;->o()I

    move-result v11

    invoke-static {v2, v5, v6, v11}, Lxa/c0;->M(Ljava/lang/Object;JI)V

    .line 213
    invoke-direct {v1, v2, v3}, Lxa/G;->W(Ljava/lang/Object;I)V

    goto :goto_1e

    :pswitch_41
    move-object v2, v9

    move-object v9, v6

    .line 214
    invoke-static {v5}, Lxa/G;->J(I)J

    move-result-wide v5

    invoke-interface {v4}, Lxa/Q;->s()J

    move-result-wide v11

    invoke-static {v2, v5, v6, v11, v12}, Lxa/c0;->N(Ljava/lang/Object;JJ)V

    .line 215
    invoke-direct {v1, v2, v3}, Lxa/G;->W(Ljava/lang/Object;I)V

    goto :goto_1e

    :pswitch_42
    move-object v2, v9

    move-object v9, v6

    .line 216
    invoke-static {v5}, Lxa/G;->J(I)J

    move-result-wide v5

    invoke-interface {v4}, Lxa/Q;->H()J

    move-result-wide v11

    invoke-static {v2, v5, v6, v11, v12}, Lxa/c0;->N(Ljava/lang/Object;JJ)V

    .line 217
    invoke-direct {v1, v2, v3}, Lxa/G;->W(Ljava/lang/Object;I)V

    goto :goto_1e

    :pswitch_43
    move-object v2, v9

    move-object v9, v6

    .line 218
    invoke-static {v5}, Lxa/G;->J(I)J

    move-result-wide v5

    invoke-interface {v4}, Lxa/Q;->readFloat()F

    move-result v11

    invoke-static {v2, v5, v6, v11}, Lxa/c0;->L(Ljava/lang/Object;JF)V

    .line 219
    invoke-direct {v1, v2, v3}, Lxa/G;->W(Ljava/lang/Object;I)V

    goto :goto_1e

    :pswitch_44
    move-object v2, v9

    move-object v9, v6

    .line 220
    invoke-static {v5}, Lxa/G;->J(I)J

    move-result-wide v5

    invoke-interface {v4}, Lxa/Q;->readDouble()D

    move-result-wide v11

    invoke-static {v2, v5, v6, v11, v12}, Lxa/c0;->K(Ljava/lang/Object;JD)V

    .line 221
    invoke-direct {v1, v2, v3}, Lxa/G;->W(Ljava/lang/Object;I)V
    :try_end_18
    .catch Lxa/r$a; {:try_start_18 .. :try_end_18} :catch_3
    .catchall {:try_start_18 .. :try_end_18} :catchall_13

    :goto_1e
    move-object v5, v10

    :cond_e
    :goto_1f
    move-object v6, v9

    goto/16 :goto_26

    :catchall_14
    move-exception v0

    move-object v2, v9

    move-object v9, v6

    goto/16 :goto_5

    :catch_f
    move-object v2, v9

    move-object v9, v6

    goto/16 :goto_e

    .line 222
    :goto_20
    :try_start_19
    invoke-virtual {v9, v4}, Lxa/Y;->o(Lxa/Q;)Z

    move-result v3

    if-eqz v3, :cond_10

    .line 223
    invoke-interface {v4}, Lxa/Q;->D()Z

    move-result v0
    :try_end_19
    .catchall {:try_start_19 .. :try_end_19} :catchall_15

    if-nez v0, :cond_e

    .line 224
    iget v0, v1, Lxa/G;->k:I

    move-object v4, v5

    :goto_21
    iget v3, v1, Lxa/G;->l:I

    if-ge v0, v3, :cond_f

    .line 225
    iget-object v3, v1, Lxa/G;->j:[I

    aget v3, v3, v0

    move-object/from16 v6, p3

    move-object v5, v9

    .line 226
    invoke-direct/range {v1 .. v6}, Lxa/G;->k(Ljava/lang/Object;ILjava/lang/Object;Lxa/Y;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    move-object v6, v5

    add-int/lit8 v0, v0, 0x1

    move-object v9, v6

    goto :goto_21

    :cond_f
    move-object v6, v9

    if-eqz v4, :cond_13

    .line 227
    :goto_22
    invoke-virtual {v6, v2, v4}, Lxa/Y;->m(Ljava/lang/Object;Ljava/lang/Object;)V

    goto :goto_25

    :catchall_15
    move-exception v0

    goto/16 :goto_b

    :cond_10
    move-object v6, v9

    if-nez v5, :cond_11

    .line 228
    :try_start_1a
    invoke-virtual {v6, v2}, Lxa/Y;->f(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    move-object v5, v3

    goto :goto_23

    :catchall_16
    move-exception v0

    goto :goto_27

    .line 229
    :cond_11
    :goto_23
    invoke-virtual {v6, v5, v4, v0}, Lxa/Y;->k(Ljava/lang/Object;Lxa/Q;I)Z

    move-result v0
    :try_end_1a
    .catchall {:try_start_1a .. :try_end_1a} :catchall_16

    if-nez v0, :cond_14

    .line 230
    iget v0, v1, Lxa/G;->k:I

    move-object v4, v5

    :goto_24
    iget v3, v1, Lxa/G;->l:I

    if-ge v0, v3, :cond_12

    .line 231
    iget-object v3, v1, Lxa/G;->j:[I

    aget v3, v3, v0

    move-object/from16 v6, p3

    move-object/from16 v5, p1

    .line 232
    invoke-direct/range {v1 .. v6}, Lxa/G;->k(Ljava/lang/Object;ILjava/lang/Object;Lxa/Y;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    move-object v6, v5

    add-int/lit8 v0, v0, 0x1

    goto :goto_24

    :cond_12
    if-eqz v4, :cond_13

    goto :goto_22

    :cond_13
    :goto_25
    return-void

    :cond_14
    :goto_26
    move-object v4, v7

    goto/16 :goto_0

    :catchall_17
    move-exception v0

    move-object/from16 v6, p1

    move-object/from16 v2, p3

    move-object v10, v5

    .line 233
    :goto_27
    iget v3, v1, Lxa/G;->k:I

    move v7, v3

    move-object v4, v5

    :goto_28
    iget v3, v1, Lxa/G;->l:I

    if-ge v7, v3, :cond_15

    .line 234
    iget-object v3, v1, Lxa/G;->j:[I

    aget v3, v3, v7

    move-object/from16 v6, p3

    move-object/from16 v5, p1

    .line 235
    invoke-direct/range {v1 .. v6}, Lxa/G;->k(Ljava/lang/Object;ILjava/lang/Object;Lxa/Y;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    move-object v6, v5

    add-int/lit8 v7, v7, 0x1

    move-object/from16 v1, p0

    goto :goto_28

    :cond_15
    if-eqz v4, :cond_16

    .line 236
    invoke-virtual {v6, v2, v4}, Lxa/Y;->m(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 237
    :cond_16
    throw v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_44
        :pswitch_43
        :pswitch_42
        :pswitch_41
        :pswitch_40
        :pswitch_3f
        :pswitch_3e
        :pswitch_3d
        :pswitch_3c
        :pswitch_3b
        :pswitch_3a
        :pswitch_39
        :pswitch_38
        :pswitch_37
        :pswitch_36
        :pswitch_35
        :pswitch_34
        :pswitch_33
        :pswitch_32
        :pswitch_31
        :pswitch_30
        :pswitch_2f
        :pswitch_2e
        :pswitch_2d
        :pswitch_2c
        :pswitch_2b
        :pswitch_2a
        :pswitch_29
        :pswitch_28
        :pswitch_27
        :pswitch_26
        :pswitch_25
        :pswitch_24
        :pswitch_23
        :pswitch_22
        :pswitch_21
        :pswitch_20
        :pswitch_1f
        :pswitch_1e
        :pswitch_1d
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method private final z(Ljava/lang/Object;ILjava/lang/Object;Lxa/j;Lxa/Q;)V
    .locals 4

    .line 1
    invoke-direct {p0, p2}, Lxa/G;->c0(I)I

    .line 2
    .line 3
    .line 4
    move-result p2

    .line 5
    invoke-static {p2}, Lxa/G;->J(I)J

    .line 6
    .line 7
    .line 8
    move-result-wide v0

    .line 9
    invoke-static {p1, v0, v1}, Lxa/c0;->A(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p2

    .line 13
    if-nez p2, :cond_0

    .line 14
    .line 15
    iget-object p2, p0, Lxa/G;->q:Lxa/y;

    .line 16
    .line 17
    invoke-interface {p2, p3}, Lxa/y;->d(Ljava/lang/Object;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object p2

    .line 21
    invoke-static {p1, v0, v1, p2}, Lxa/c0;->O(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    iget-object v2, p0, Lxa/G;->q:Lxa/y;

    .line 26
    .line 27
    invoke-interface {v2, p2}, Lxa/y;->g(Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    move-result v2

    .line 31
    if-eqz v2, :cond_1

    .line 32
    .line 33
    iget-object v2, p0, Lxa/G;->q:Lxa/y;

    .line 34
    .line 35
    invoke-interface {v2, p3}, Lxa/y;->d(Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v2

    .line 39
    iget-object v3, p0, Lxa/G;->q:Lxa/y;

    .line 40
    .line 41
    invoke-interface {v3, v2, p2}, Lxa/y;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    invoke-static {p1, v0, v1, v2}, Lxa/c0;->O(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 45
    .line 46
    .line 47
    move-object p2, v2

    .line 48
    :cond_1
    :goto_0
    iget-object p1, p0, Lxa/G;->q:Lxa/y;

    .line 49
    .line 50
    invoke-interface {p1, p2}, Lxa/y;->c(Ljava/lang/Object;)Ljava/util/Map;

    .line 51
    .line 52
    .line 53
    move-result-object p1

    .line 54
    iget-object p2, p0, Lxa/G;->q:Lxa/y;

    .line 55
    .line 56
    invoke-interface {p2, p3}, Lxa/y;->b(Ljava/lang/Object;)Lxa/w$a;

    .line 57
    .line 58
    .line 59
    move-result-object p2

    .line 60
    invoke-interface {p5, p1, p2, p4}, Lxa/Q;->M(Ljava/util/Map;Lxa/w$a;Lxa/j;)V

    .line 61
    .line 62
    .line 63
    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 2

    .line 1
    invoke-static {p1}, Lxa/G;->i(Ljava/lang/Object;)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    :goto_0
    iget-object v1, p0, Lxa/G;->a:[I

    .line 9
    .line 10
    array-length v1, v1

    .line 11
    if-ge v0, v1, :cond_0

    .line 12
    .line 13
    invoke-direct {p0, p1, p2, v0}, Lxa/G;->C(Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 14
    .line 15
    .line 16
    add-int/lit8 v0, v0, 0x3

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    iget-object v0, p0, Lxa/G;->o:Lxa/Y;

    .line 20
    .line 21
    invoke-static {v0, p1, p2}, Lxa/U;->g(Lxa/Y;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    iget-boolean v0, p0, Lxa/G;->f:Z

    .line 25
    .line 26
    if-eqz v0, :cond_1

    .line 27
    .line 28
    iget-object v0, p0, Lxa/G;->p:Lxa/k;

    .line 29
    .line 30
    invoke-static {v0, p1, p2}, Lxa/U;->e(Lxa/k;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 31
    .line 32
    .line 33
    :cond_1
    return-void
.end method

.method public b()Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, Lxa/G;->m:Lxa/I;

    .line 2
    .line 3
    iget-object v1, p0, Lxa/G;->e:Lxa/D;

    .line 4
    .line 5
    invoke-interface {v0, v1}, Lxa/I;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0
.end method

.method public c(Ljava/lang/Object;)V
    .locals 7

    .line 1
    invoke-static {p1}, Lxa/G;->u(Ljava/lang/Object;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    goto/16 :goto_2

    .line 8
    .line 9
    :cond_0
    instance-of v0, p1, Lxa/p;

    .line 10
    .line 11
    if-eqz v0, :cond_1

    .line 12
    .line 13
    move-object v0, p1

    .line 14
    check-cast v0, Lxa/p;

    .line 15
    .line 16
    invoke-virtual {v0}, Lxa/p;->g()V

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0}, Lxa/p;->f()V

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0}, Lxa/p;->v()V

    .line 23
    .line 24
    .line 25
    :cond_1
    iget-object v0, p0, Lxa/G;->a:[I

    .line 26
    .line 27
    array-length v0, v0

    .line 28
    const/4 v1, 0x0

    .line 29
    :goto_0
    if-ge v1, v0, :cond_5

    .line 30
    .line 31
    invoke-direct {p0, v1}, Lxa/G;->c0(I)I

    .line 32
    .line 33
    .line 34
    move-result v2

    .line 35
    invoke-static {v2}, Lxa/G;->J(I)J

    .line 36
    .line 37
    .line 38
    move-result-wide v3

    .line 39
    invoke-static {v2}, Lxa/G;->b0(I)I

    .line 40
    .line 41
    .line 42
    move-result v2

    .line 43
    const/16 v5, 0x9

    .line 44
    .line 45
    if-eq v2, v5, :cond_3

    .line 46
    .line 47
    const/16 v5, 0x3c

    .line 48
    .line 49
    if-eq v2, v5, :cond_2

    .line 50
    .line 51
    const/16 v5, 0x44

    .line 52
    .line 53
    if-eq v2, v5, :cond_2

    .line 54
    .line 55
    packed-switch v2, :pswitch_data_0

    .line 56
    .line 57
    .line 58
    goto :goto_1

    .line 59
    :pswitch_0
    sget-object v2, Lxa/G;->s:Lsun/misc/Unsafe;

    .line 60
    .line 61
    invoke-virtual {v2, p1, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object v5

    .line 65
    if-eqz v5, :cond_4

    .line 66
    .line 67
    iget-object v6, p0, Lxa/G;->q:Lxa/y;

    .line 68
    .line 69
    invoke-interface {v6, v5}, Lxa/y;->f(Ljava/lang/Object;)Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object v5

    .line 73
    invoke-virtual {v2, p1, v3, v4, v5}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 74
    .line 75
    .line 76
    goto :goto_1

    .line 77
    :pswitch_1
    iget-object v2, p0, Lxa/G;->n:Lxa/u;

    .line 78
    .line 79
    invoke-virtual {v2, p1, v3, v4}, Lxa/u;->c(Ljava/lang/Object;J)V

    .line 80
    .line 81
    .line 82
    goto :goto_1

    .line 83
    :cond_2
    invoke-direct {p0, v1}, Lxa/G;->I(I)I

    .line 84
    .line 85
    .line 86
    move-result v2

    .line 87
    invoke-direct {p0, p1, v2, v1}, Lxa/G;->w(Ljava/lang/Object;II)Z

    .line 88
    .line 89
    .line 90
    move-result v2

    .line 91
    if-eqz v2, :cond_4

    .line 92
    .line 93
    invoke-direct {p0, v1}, Lxa/G;->n(I)Lxa/S;

    .line 94
    .line 95
    .line 96
    move-result-object v2

    .line 97
    sget-object v5, Lxa/G;->s:Lsun/misc/Unsafe;

    .line 98
    .line 99
    invoke-virtual {v5, p1, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 100
    .line 101
    .line 102
    move-result-object v3

    .line 103
    invoke-interface {v2, v3}, Lxa/S;->c(Ljava/lang/Object;)V

    .line 104
    .line 105
    .line 106
    goto :goto_1

    .line 107
    :cond_3
    :pswitch_2
    invoke-direct {p0, p1, v1}, Lxa/G;->p(Ljava/lang/Object;I)Z

    .line 108
    .line 109
    .line 110
    move-result v2

    .line 111
    if-eqz v2, :cond_4

    .line 112
    .line 113
    invoke-direct {p0, v1}, Lxa/G;->n(I)Lxa/S;

    .line 114
    .line 115
    .line 116
    move-result-object v2

    .line 117
    sget-object v5, Lxa/G;->s:Lsun/misc/Unsafe;

    .line 118
    .line 119
    invoke-virtual {v5, p1, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 120
    .line 121
    .line 122
    move-result-object v3

    .line 123
    invoke-interface {v2, v3}, Lxa/S;->c(Ljava/lang/Object;)V

    .line 124
    .line 125
    .line 126
    :cond_4
    :goto_1
    add-int/lit8 v1, v1, 0x3

    .line 127
    .line 128
    goto :goto_0

    .line 129
    :cond_5
    iget-object v0, p0, Lxa/G;->o:Lxa/Y;

    .line 130
    .line 131
    invoke-virtual {v0, p1}, Lxa/Y;->h(Ljava/lang/Object;)V

    .line 132
    .line 133
    .line 134
    iget-boolean v0, p0, Lxa/G;->f:Z

    .line 135
    .line 136
    if-eqz v0, :cond_6

    .line 137
    .line 138
    iget-object v0, p0, Lxa/G;->p:Lxa/k;

    .line 139
    .line 140
    invoke-virtual {v0, p1}, Lxa/k;->e(Ljava/lang/Object;)V

    .line 141
    .line 142
    .line 143
    :cond_6
    :goto_2
    return-void

    .line 144
    nop

    .line 145
    :pswitch_data_0
    .packed-switch 0x11
        :pswitch_2
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final d(Ljava/lang/Object;)Z
    .locals 14

    .line 1
    const v0, 0xfffff

    .line 2
    .line 3
    .line 4
    const/4 v1, 0x0

    .line 5
    move v3, v0

    .line 6
    move v2, v1

    .line 7
    move v4, v2

    .line 8
    :goto_0
    iget v5, p0, Lxa/G;->k:I

    .line 9
    .line 10
    const/4 v6, 0x1

    .line 11
    if-ge v2, v5, :cond_8

    .line 12
    .line 13
    iget-object v5, p0, Lxa/G;->j:[I

    .line 14
    .line 15
    aget v9, v5, v2

    .line 16
    .line 17
    invoke-direct {p0, v9}, Lxa/G;->I(I)I

    .line 18
    .line 19
    .line 20
    move-result v5

    .line 21
    invoke-direct {p0, v9}, Lxa/G;->c0(I)I

    .line 22
    .line 23
    .line 24
    move-result v13

    .line 25
    iget-object v7, p0, Lxa/G;->a:[I

    .line 26
    .line 27
    add-int/lit8 v8, v9, 0x2

    .line 28
    .line 29
    aget v7, v7, v8

    .line 30
    .line 31
    and-int v8, v7, v0

    .line 32
    .line 33
    ushr-int/lit8 v7, v7, 0x14

    .line 34
    .line 35
    shl-int v12, v6, v7

    .line 36
    .line 37
    if-eq v8, v3, :cond_1

    .line 38
    .line 39
    if-eq v8, v0, :cond_0

    .line 40
    .line 41
    sget-object v3, Lxa/G;->s:Lsun/misc/Unsafe;

    .line 42
    .line 43
    int-to-long v6, v8

    .line 44
    invoke-virtual {v3, p1, v6, v7}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    .line 45
    .line 46
    .line 47
    move-result v4

    .line 48
    :cond_0
    move v11, v4

    .line 49
    move v10, v8

    .line 50
    goto :goto_1

    .line 51
    :cond_1
    move v10, v3

    .line 52
    move v11, v4

    .line 53
    :goto_1
    invoke-static {v13}, Lxa/G;->x(I)Z

    .line 54
    .line 55
    .line 56
    move-result v3

    .line 57
    move-object v7, p0

    .line 58
    move-object v8, p1

    .line 59
    if-eqz v3, :cond_2

    .line 60
    .line 61
    invoke-direct/range {v7 .. v12}, Lxa/G;->q(Ljava/lang/Object;IIII)Z

    .line 62
    .line 63
    .line 64
    move-result p1

    .line 65
    if-nez p1, :cond_2

    .line 66
    .line 67
    return v1

    .line 68
    :cond_2
    invoke-static {v13}, Lxa/G;->b0(I)I

    .line 69
    .line 70
    .line 71
    move-result p1

    .line 72
    const/16 v3, 0x9

    .line 73
    .line 74
    if-eq p1, v3, :cond_6

    .line 75
    .line 76
    const/16 v3, 0x11

    .line 77
    .line 78
    if-eq p1, v3, :cond_6

    .line 79
    .line 80
    const/16 v3, 0x1b

    .line 81
    .line 82
    if-eq p1, v3, :cond_5

    .line 83
    .line 84
    const/16 v3, 0x3c

    .line 85
    .line 86
    if-eq p1, v3, :cond_4

    .line 87
    .line 88
    const/16 v3, 0x44

    .line 89
    .line 90
    if-eq p1, v3, :cond_4

    .line 91
    .line 92
    const/16 v3, 0x31

    .line 93
    .line 94
    if-eq p1, v3, :cond_5

    .line 95
    .line 96
    const/16 v3, 0x32

    .line 97
    .line 98
    if-eq p1, v3, :cond_3

    .line 99
    .line 100
    goto :goto_2

    .line 101
    :cond_3
    invoke-direct {p0, v8, v13, v9}, Lxa/G;->t(Ljava/lang/Object;II)Z

    .line 102
    .line 103
    .line 104
    move-result p1

    .line 105
    if-nez p1, :cond_7

    .line 106
    .line 107
    return v1

    .line 108
    :cond_4
    invoke-direct {p0, v8, v5, v9}, Lxa/G;->w(Ljava/lang/Object;II)Z

    .line 109
    .line 110
    .line 111
    move-result p1

    .line 112
    if-eqz p1, :cond_7

    .line 113
    .line 114
    invoke-direct {p0, v9}, Lxa/G;->n(I)Lxa/S;

    .line 115
    .line 116
    .line 117
    move-result-object p1

    .line 118
    invoke-static {v8, v13, p1}, Lxa/G;->r(Ljava/lang/Object;ILxa/S;)Z

    .line 119
    .line 120
    .line 121
    move-result p1

    .line 122
    if-nez p1, :cond_7

    .line 123
    .line 124
    return v1

    .line 125
    :cond_5
    invoke-direct {p0, v8, v13, v9}, Lxa/G;->s(Ljava/lang/Object;II)Z

    .line 126
    .line 127
    .line 128
    move-result p1

    .line 129
    if-nez p1, :cond_7

    .line 130
    .line 131
    return v1

    .line 132
    :cond_6
    invoke-direct/range {v7 .. v12}, Lxa/G;->q(Ljava/lang/Object;IIII)Z

    .line 133
    .line 134
    .line 135
    move-result p1

    .line 136
    if-eqz p1, :cond_7

    .line 137
    .line 138
    invoke-direct {p0, v9}, Lxa/G;->n(I)Lxa/S;

    .line 139
    .line 140
    .line 141
    move-result-object p1

    .line 142
    invoke-static {v8, v13, p1}, Lxa/G;->r(Ljava/lang/Object;ILxa/S;)Z

    .line 143
    .line 144
    .line 145
    move-result p1

    .line 146
    if-nez p1, :cond_7

    .line 147
    .line 148
    return v1

    .line 149
    :cond_7
    :goto_2
    add-int/lit8 v2, v2, 0x1

    .line 150
    .line 151
    move-object p1, v8

    .line 152
    move v3, v10

    .line 153
    move v4, v11

    .line 154
    goto/16 :goto_0

    .line 155
    .line 156
    :cond_8
    move-object v7, p0

    .line 157
    move-object v8, p1

    .line 158
    iget-boolean p1, v7, Lxa/G;->f:Z

    .line 159
    .line 160
    if-eqz p1, :cond_9

    .line 161
    .line 162
    iget-object p1, v7, Lxa/G;->p:Lxa/k;

    .line 163
    .line 164
    invoke-virtual {p1, v8}, Lxa/k;->b(Ljava/lang/Object;)Lxa/n;

    .line 165
    .line 166
    .line 167
    move-result-object p1

    .line 168
    invoke-virtual {p1}, Lxa/n;->b()Z

    .line 169
    .line 170
    .line 171
    move-result p1

    .line 172
    if-nez p1, :cond_9

    .line 173
    .line 174
    return v1

    .line 175
    :cond_9
    return v6
.end method

.method public e(Ljava/lang/Object;)I
    .locals 8

    .line 1
    iget-object v0, p0, Lxa/G;->a:[I

    .line 2
    .line 3
    array-length v0, v0

    .line 4
    const/4 v1, 0x0

    .line 5
    move v2, v1

    .line 6
    :goto_0
    if-ge v1, v0, :cond_2

    .line 7
    .line 8
    invoke-direct {p0, v1}, Lxa/G;->c0(I)I

    .line 9
    .line 10
    .line 11
    move-result v3

    .line 12
    invoke-direct {p0, v1}, Lxa/G;->I(I)I

    .line 13
    .line 14
    .line 15
    move-result v4

    .line 16
    invoke-static {v3}, Lxa/G;->J(I)J

    .line 17
    .line 18
    .line 19
    move-result-wide v5

    .line 20
    invoke-static {v3}, Lxa/G;->b0(I)I

    .line 21
    .line 22
    .line 23
    move-result v3

    .line 24
    const/16 v7, 0x25

    .line 25
    .line 26
    packed-switch v3, :pswitch_data_0

    .line 27
    .line 28
    .line 29
    goto/16 :goto_3

    .line 30
    .line 31
    :pswitch_0
    invoke-direct {p0, p1, v4, v1}, Lxa/G;->w(Ljava/lang/Object;II)Z

    .line 32
    .line 33
    .line 34
    move-result v3

    .line 35
    if-eqz v3, :cond_1

    .line 36
    .line 37
    invoke-static {p1, v5, v6}, Lxa/c0;->A(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v3

    .line 41
    mul-int/lit8 v2, v2, 0x35

    .line 42
    .line 43
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    .line 44
    .line 45
    .line 46
    move-result v3

    .line 47
    :goto_1
    add-int/2addr v2, v3

    .line 48
    goto/16 :goto_3

    .line 49
    .line 50
    :pswitch_1
    invoke-direct {p0, p1, v4, v1}, Lxa/G;->w(Ljava/lang/Object;II)Z

    .line 51
    .line 52
    .line 53
    move-result v3

    .line 54
    if-eqz v3, :cond_1

    .line 55
    .line 56
    mul-int/lit8 v2, v2, 0x35

    .line 57
    .line 58
    invoke-static {p1, v5, v6}, Lxa/G;->O(Ljava/lang/Object;J)J

    .line 59
    .line 60
    .line 61
    move-result-wide v3

    .line 62
    invoke-static {v3, v4}, Lxa/q;->f(J)I

    .line 63
    .line 64
    .line 65
    move-result v3

    .line 66
    goto :goto_1

    .line 67
    :pswitch_2
    invoke-direct {p0, p1, v4, v1}, Lxa/G;->w(Ljava/lang/Object;II)Z

    .line 68
    .line 69
    .line 70
    move-result v3

    .line 71
    if-eqz v3, :cond_1

    .line 72
    .line 73
    mul-int/lit8 v2, v2, 0x35

    .line 74
    .line 75
    invoke-static {p1, v5, v6}, Lxa/G;->N(Ljava/lang/Object;J)I

    .line 76
    .line 77
    .line 78
    move-result v3

    .line 79
    goto :goto_1

    .line 80
    :pswitch_3
    invoke-direct {p0, p1, v4, v1}, Lxa/G;->w(Ljava/lang/Object;II)Z

    .line 81
    .line 82
    .line 83
    move-result v3

    .line 84
    if-eqz v3, :cond_1

    .line 85
    .line 86
    mul-int/lit8 v2, v2, 0x35

    .line 87
    .line 88
    invoke-static {p1, v5, v6}, Lxa/G;->O(Ljava/lang/Object;J)J

    .line 89
    .line 90
    .line 91
    move-result-wide v3

    .line 92
    invoke-static {v3, v4}, Lxa/q;->f(J)I

    .line 93
    .line 94
    .line 95
    move-result v3

    .line 96
    goto :goto_1

    .line 97
    :pswitch_4
    invoke-direct {p0, p1, v4, v1}, Lxa/G;->w(Ljava/lang/Object;II)Z

    .line 98
    .line 99
    .line 100
    move-result v3

    .line 101
    if-eqz v3, :cond_1

    .line 102
    .line 103
    mul-int/lit8 v2, v2, 0x35

    .line 104
    .line 105
    invoke-static {p1, v5, v6}, Lxa/G;->N(Ljava/lang/Object;J)I

    .line 106
    .line 107
    .line 108
    move-result v3

    .line 109
    goto :goto_1

    .line 110
    :pswitch_5
    invoke-direct {p0, p1, v4, v1}, Lxa/G;->w(Ljava/lang/Object;II)Z

    .line 111
    .line 112
    .line 113
    move-result v3

    .line 114
    if-eqz v3, :cond_1

    .line 115
    .line 116
    mul-int/lit8 v2, v2, 0x35

    .line 117
    .line 118
    invoke-static {p1, v5, v6}, Lxa/G;->N(Ljava/lang/Object;J)I

    .line 119
    .line 120
    .line 121
    move-result v3

    .line 122
    goto :goto_1

    .line 123
    :pswitch_6
    invoke-direct {p0, p1, v4, v1}, Lxa/G;->w(Ljava/lang/Object;II)Z

    .line 124
    .line 125
    .line 126
    move-result v3

    .line 127
    if-eqz v3, :cond_1

    .line 128
    .line 129
    mul-int/lit8 v2, v2, 0x35

    .line 130
    .line 131
    invoke-static {p1, v5, v6}, Lxa/G;->N(Ljava/lang/Object;J)I

    .line 132
    .line 133
    .line 134
    move-result v3

    .line 135
    goto :goto_1

    .line 136
    :pswitch_7
    invoke-direct {p0, p1, v4, v1}, Lxa/G;->w(Ljava/lang/Object;II)Z

    .line 137
    .line 138
    .line 139
    move-result v3

    .line 140
    if-eqz v3, :cond_1

    .line 141
    .line 142
    mul-int/lit8 v2, v2, 0x35

    .line 143
    .line 144
    invoke-static {p1, v5, v6}, Lxa/c0;->A(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 145
    .line 146
    .line 147
    move-result-object v3

    .line 148
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    .line 149
    .line 150
    .line 151
    move-result v3

    .line 152
    goto :goto_1

    .line 153
    :pswitch_8
    invoke-direct {p0, p1, v4, v1}, Lxa/G;->w(Ljava/lang/Object;II)Z

    .line 154
    .line 155
    .line 156
    move-result v3

    .line 157
    if-eqz v3, :cond_1

    .line 158
    .line 159
    invoke-static {p1, v5, v6}, Lxa/c0;->A(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 160
    .line 161
    .line 162
    move-result-object v3

    .line 163
    mul-int/lit8 v2, v2, 0x35

    .line 164
    .line 165
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    .line 166
    .line 167
    .line 168
    move-result v3

    .line 169
    goto :goto_1

    .line 170
    :pswitch_9
    invoke-direct {p0, p1, v4, v1}, Lxa/G;->w(Ljava/lang/Object;II)Z

    .line 171
    .line 172
    .line 173
    move-result v3

    .line 174
    if-eqz v3, :cond_1

    .line 175
    .line 176
    mul-int/lit8 v2, v2, 0x35

    .line 177
    .line 178
    invoke-static {p1, v5, v6}, Lxa/c0;->A(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 179
    .line 180
    .line 181
    move-result-object v3

    .line 182
    check-cast v3, Ljava/lang/String;

    .line 183
    .line 184
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    .line 185
    .line 186
    .line 187
    move-result v3

    .line 188
    goto/16 :goto_1

    .line 189
    .line 190
    :pswitch_a
    invoke-direct {p0, p1, v4, v1}, Lxa/G;->w(Ljava/lang/Object;II)Z

    .line 191
    .line 192
    .line 193
    move-result v3

    .line 194
    if-eqz v3, :cond_1

    .line 195
    .line 196
    mul-int/lit8 v2, v2, 0x35

    .line 197
    .line 198
    invoke-static {p1, v5, v6}, Lxa/G;->K(Ljava/lang/Object;J)Z

    .line 199
    .line 200
    .line 201
    move-result v3

    .line 202
    invoke-static {v3}, Lxa/q;->c(Z)I

    .line 203
    .line 204
    .line 205
    move-result v3

    .line 206
    goto/16 :goto_1

    .line 207
    .line 208
    :pswitch_b
    invoke-direct {p0, p1, v4, v1}, Lxa/G;->w(Ljava/lang/Object;II)Z

    .line 209
    .line 210
    .line 211
    move-result v3

    .line 212
    if-eqz v3, :cond_1

    .line 213
    .line 214
    mul-int/lit8 v2, v2, 0x35

    .line 215
    .line 216
    invoke-static {p1, v5, v6}, Lxa/G;->N(Ljava/lang/Object;J)I

    .line 217
    .line 218
    .line 219
    move-result v3

    .line 220
    goto/16 :goto_1

    .line 221
    .line 222
    :pswitch_c
    invoke-direct {p0, p1, v4, v1}, Lxa/G;->w(Ljava/lang/Object;II)Z

    .line 223
    .line 224
    .line 225
    move-result v3

    .line 226
    if-eqz v3, :cond_1

    .line 227
    .line 228
    mul-int/lit8 v2, v2, 0x35

    .line 229
    .line 230
    invoke-static {p1, v5, v6}, Lxa/G;->O(Ljava/lang/Object;J)J

    .line 231
    .line 232
    .line 233
    move-result-wide v3

    .line 234
    invoke-static {v3, v4}, Lxa/q;->f(J)I

    .line 235
    .line 236
    .line 237
    move-result v3

    .line 238
    goto/16 :goto_1

    .line 239
    .line 240
    :pswitch_d
    invoke-direct {p0, p1, v4, v1}, Lxa/G;->w(Ljava/lang/Object;II)Z

    .line 241
    .line 242
    .line 243
    move-result v3

    .line 244
    if-eqz v3, :cond_1

    .line 245
    .line 246
    mul-int/lit8 v2, v2, 0x35

    .line 247
    .line 248
    invoke-static {p1, v5, v6}, Lxa/G;->N(Ljava/lang/Object;J)I

    .line 249
    .line 250
    .line 251
    move-result v3

    .line 252
    goto/16 :goto_1

    .line 253
    .line 254
    :pswitch_e
    invoke-direct {p0, p1, v4, v1}, Lxa/G;->w(Ljava/lang/Object;II)Z

    .line 255
    .line 256
    .line 257
    move-result v3

    .line 258
    if-eqz v3, :cond_1

    .line 259
    .line 260
    mul-int/lit8 v2, v2, 0x35

    .line 261
    .line 262
    invoke-static {p1, v5, v6}, Lxa/G;->O(Ljava/lang/Object;J)J

    .line 263
    .line 264
    .line 265
    move-result-wide v3

    .line 266
    invoke-static {v3, v4}, Lxa/q;->f(J)I

    .line 267
    .line 268
    .line 269
    move-result v3

    .line 270
    goto/16 :goto_1

    .line 271
    .line 272
    :pswitch_f
    invoke-direct {p0, p1, v4, v1}, Lxa/G;->w(Ljava/lang/Object;II)Z

    .line 273
    .line 274
    .line 275
    move-result v3

    .line 276
    if-eqz v3, :cond_1

    .line 277
    .line 278
    mul-int/lit8 v2, v2, 0x35

    .line 279
    .line 280
    invoke-static {p1, v5, v6}, Lxa/G;->O(Ljava/lang/Object;J)J

    .line 281
    .line 282
    .line 283
    move-result-wide v3

    .line 284
    invoke-static {v3, v4}, Lxa/q;->f(J)I

    .line 285
    .line 286
    .line 287
    move-result v3

    .line 288
    goto/16 :goto_1

    .line 289
    .line 290
    :pswitch_10
    invoke-direct {p0, p1, v4, v1}, Lxa/G;->w(Ljava/lang/Object;II)Z

    .line 291
    .line 292
    .line 293
    move-result v3

    .line 294
    if-eqz v3, :cond_1

    .line 295
    .line 296
    mul-int/lit8 v2, v2, 0x35

    .line 297
    .line 298
    invoke-static {p1, v5, v6}, Lxa/G;->M(Ljava/lang/Object;J)F

    .line 299
    .line 300
    .line 301
    move-result v3

    .line 302
    invoke-static {v3}, Ljava/lang/Float;->floatToIntBits(F)I

    .line 303
    .line 304
    .line 305
    move-result v3

    .line 306
    goto/16 :goto_1

    .line 307
    .line 308
    :pswitch_11
    invoke-direct {p0, p1, v4, v1}, Lxa/G;->w(Ljava/lang/Object;II)Z

    .line 309
    .line 310
    .line 311
    move-result v3

    .line 312
    if-eqz v3, :cond_1

    .line 313
    .line 314
    mul-int/lit8 v2, v2, 0x35

    .line 315
    .line 316
    invoke-static {p1, v5, v6}, Lxa/G;->L(Ljava/lang/Object;J)D

    .line 317
    .line 318
    .line 319
    move-result-wide v3

    .line 320
    invoke-static {v3, v4}, Ljava/lang/Double;->doubleToLongBits(D)J

    .line 321
    .line 322
    .line 323
    move-result-wide v3

    .line 324
    invoke-static {v3, v4}, Lxa/q;->f(J)I

    .line 325
    .line 326
    .line 327
    move-result v3

    .line 328
    goto/16 :goto_1

    .line 329
    .line 330
    :pswitch_12
    mul-int/lit8 v2, v2, 0x35

    .line 331
    .line 332
    invoke-static {p1, v5, v6}, Lxa/c0;->A(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 333
    .line 334
    .line 335
    move-result-object v3

    .line 336
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    .line 337
    .line 338
    .line 339
    move-result v3

    .line 340
    goto/16 :goto_1

    .line 341
    .line 342
    :pswitch_13
    mul-int/lit8 v2, v2, 0x35

    .line 343
    .line 344
    invoke-static {p1, v5, v6}, Lxa/c0;->A(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 345
    .line 346
    .line 347
    move-result-object v3

    .line 348
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    .line 349
    .line 350
    .line 351
    move-result v3

    .line 352
    goto/16 :goto_1

    .line 353
    .line 354
    :pswitch_14
    invoke-static {p1, v5, v6}, Lxa/c0;->A(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 355
    .line 356
    .line 357
    move-result-object v3

    .line 358
    if-eqz v3, :cond_0

    .line 359
    .line 360
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    .line 361
    .line 362
    .line 363
    move-result v7

    .line 364
    :cond_0
    :goto_2
    mul-int/lit8 v2, v2, 0x35

    .line 365
    .line 366
    add-int/2addr v2, v7

    .line 367
    goto/16 :goto_3

    .line 368
    .line 369
    :pswitch_15
    mul-int/lit8 v2, v2, 0x35

    .line 370
    .line 371
    invoke-static {p1, v5, v6}, Lxa/c0;->y(Ljava/lang/Object;J)J

    .line 372
    .line 373
    .line 374
    move-result-wide v3

    .line 375
    invoke-static {v3, v4}, Lxa/q;->f(J)I

    .line 376
    .line 377
    .line 378
    move-result v3

    .line 379
    goto/16 :goto_1

    .line 380
    .line 381
    :pswitch_16
    mul-int/lit8 v2, v2, 0x35

    .line 382
    .line 383
    invoke-static {p1, v5, v6}, Lxa/c0;->x(Ljava/lang/Object;J)I

    .line 384
    .line 385
    .line 386
    move-result v3

    .line 387
    goto/16 :goto_1

    .line 388
    .line 389
    :pswitch_17
    mul-int/lit8 v2, v2, 0x35

    .line 390
    .line 391
    invoke-static {p1, v5, v6}, Lxa/c0;->y(Ljava/lang/Object;J)J

    .line 392
    .line 393
    .line 394
    move-result-wide v3

    .line 395
    invoke-static {v3, v4}, Lxa/q;->f(J)I

    .line 396
    .line 397
    .line 398
    move-result v3

    .line 399
    goto/16 :goto_1

    .line 400
    .line 401
    :pswitch_18
    mul-int/lit8 v2, v2, 0x35

    .line 402
    .line 403
    invoke-static {p1, v5, v6}, Lxa/c0;->x(Ljava/lang/Object;J)I

    .line 404
    .line 405
    .line 406
    move-result v3

    .line 407
    goto/16 :goto_1

    .line 408
    .line 409
    :pswitch_19
    mul-int/lit8 v2, v2, 0x35

    .line 410
    .line 411
    invoke-static {p1, v5, v6}, Lxa/c0;->x(Ljava/lang/Object;J)I

    .line 412
    .line 413
    .line 414
    move-result v3

    .line 415
    goto/16 :goto_1

    .line 416
    .line 417
    :pswitch_1a
    mul-int/lit8 v2, v2, 0x35

    .line 418
    .line 419
    invoke-static {p1, v5, v6}, Lxa/c0;->x(Ljava/lang/Object;J)I

    .line 420
    .line 421
    .line 422
    move-result v3

    .line 423
    goto/16 :goto_1

    .line 424
    .line 425
    :pswitch_1b
    mul-int/lit8 v2, v2, 0x35

    .line 426
    .line 427
    invoke-static {p1, v5, v6}, Lxa/c0;->A(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 428
    .line 429
    .line 430
    move-result-object v3

    .line 431
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    .line 432
    .line 433
    .line 434
    move-result v3

    .line 435
    goto/16 :goto_1

    .line 436
    .line 437
    :pswitch_1c
    invoke-static {p1, v5, v6}, Lxa/c0;->A(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 438
    .line 439
    .line 440
    move-result-object v3

    .line 441
    if-eqz v3, :cond_0

    .line 442
    .line 443
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    .line 444
    .line 445
    .line 446
    move-result v7

    .line 447
    goto :goto_2

    .line 448
    :pswitch_1d
    mul-int/lit8 v2, v2, 0x35

    .line 449
    .line 450
    invoke-static {p1, v5, v6}, Lxa/c0;->A(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 451
    .line 452
    .line 453
    move-result-object v3

    .line 454
    check-cast v3, Ljava/lang/String;

    .line 455
    .line 456
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    .line 457
    .line 458
    .line 459
    move-result v3

    .line 460
    goto/16 :goto_1

    .line 461
    .line 462
    :pswitch_1e
    mul-int/lit8 v2, v2, 0x35

    .line 463
    .line 464
    invoke-static {p1, v5, v6}, Lxa/c0;->p(Ljava/lang/Object;J)Z

    .line 465
    .line 466
    .line 467
    move-result v3

    .line 468
    invoke-static {v3}, Lxa/q;->c(Z)I

    .line 469
    .line 470
    .line 471
    move-result v3

    .line 472
    goto/16 :goto_1

    .line 473
    .line 474
    :pswitch_1f
    mul-int/lit8 v2, v2, 0x35

    .line 475
    .line 476
    invoke-static {p1, v5, v6}, Lxa/c0;->x(Ljava/lang/Object;J)I

    .line 477
    .line 478
    .line 479
    move-result v3

    .line 480
    goto/16 :goto_1

    .line 481
    .line 482
    :pswitch_20
    mul-int/lit8 v2, v2, 0x35

    .line 483
    .line 484
    invoke-static {p1, v5, v6}, Lxa/c0;->y(Ljava/lang/Object;J)J

    .line 485
    .line 486
    .line 487
    move-result-wide v3

    .line 488
    invoke-static {v3, v4}, Lxa/q;->f(J)I

    .line 489
    .line 490
    .line 491
    move-result v3

    .line 492
    goto/16 :goto_1

    .line 493
    .line 494
    :pswitch_21
    mul-int/lit8 v2, v2, 0x35

    .line 495
    .line 496
    invoke-static {p1, v5, v6}, Lxa/c0;->x(Ljava/lang/Object;J)I

    .line 497
    .line 498
    .line 499
    move-result v3

    .line 500
    goto/16 :goto_1

    .line 501
    .line 502
    :pswitch_22
    mul-int/lit8 v2, v2, 0x35

    .line 503
    .line 504
    invoke-static {p1, v5, v6}, Lxa/c0;->y(Ljava/lang/Object;J)J

    .line 505
    .line 506
    .line 507
    move-result-wide v3

    .line 508
    invoke-static {v3, v4}, Lxa/q;->f(J)I

    .line 509
    .line 510
    .line 511
    move-result v3

    .line 512
    goto/16 :goto_1

    .line 513
    .line 514
    :pswitch_23
    mul-int/lit8 v2, v2, 0x35

    .line 515
    .line 516
    invoke-static {p1, v5, v6}, Lxa/c0;->y(Ljava/lang/Object;J)J

    .line 517
    .line 518
    .line 519
    move-result-wide v3

    .line 520
    invoke-static {v3, v4}, Lxa/q;->f(J)I

    .line 521
    .line 522
    .line 523
    move-result v3

    .line 524
    goto/16 :goto_1

    .line 525
    .line 526
    :pswitch_24
    mul-int/lit8 v2, v2, 0x35

    .line 527
    .line 528
    invoke-static {p1, v5, v6}, Lxa/c0;->w(Ljava/lang/Object;J)F

    .line 529
    .line 530
    .line 531
    move-result v3

    .line 532
    invoke-static {v3}, Ljava/lang/Float;->floatToIntBits(F)I

    .line 533
    .line 534
    .line 535
    move-result v3

    .line 536
    goto/16 :goto_1

    .line 537
    .line 538
    :pswitch_25
    mul-int/lit8 v2, v2, 0x35

    .line 539
    .line 540
    invoke-static {p1, v5, v6}, Lxa/c0;->v(Ljava/lang/Object;J)D

    .line 541
    .line 542
    .line 543
    move-result-wide v3

    .line 544
    invoke-static {v3, v4}, Ljava/lang/Double;->doubleToLongBits(D)J

    .line 545
    .line 546
    .line 547
    move-result-wide v3

    .line 548
    invoke-static {v3, v4}, Lxa/q;->f(J)I

    .line 549
    .line 550
    .line 551
    move-result v3

    .line 552
    goto/16 :goto_1

    .line 553
    .line 554
    :cond_1
    :goto_3
    add-int/lit8 v1, v1, 0x3

    .line 555
    .line 556
    goto/16 :goto_0

    .line 557
    .line 558
    :cond_2
    mul-int/lit8 v2, v2, 0x35

    .line 559
    .line 560
    iget-object v0, p0, Lxa/G;->o:Lxa/Y;

    .line 561
    .line 562
    invoke-virtual {v0, p1}, Lxa/Y;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 563
    .line 564
    .line 565
    move-result-object v0

    .line 566
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 567
    .line 568
    .line 569
    move-result v0

    .line 570
    add-int/2addr v2, v0

    .line 571
    iget-boolean v0, p0, Lxa/G;->f:Z

    .line 572
    .line 573
    if-eqz v0, :cond_3

    .line 574
    .line 575
    mul-int/lit8 v2, v2, 0x35

    .line 576
    .line 577
    iget-object v0, p0, Lxa/G;->p:Lxa/k;

    .line 578
    .line 579
    invoke-virtual {v0, p1}, Lxa/k;->b(Ljava/lang/Object;)Lxa/n;

    .line 580
    .line 581
    .line 582
    move-result-object p1

    .line 583
    invoke-virtual {p1}, Lxa/n;->hashCode()I

    .line 584
    .line 585
    .line 586
    move-result p1

    .line 587
    add-int/2addr v2, p1

    .line 588
    :cond_3
    return v2

    .line 589
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_25
        :pswitch_24
        :pswitch_23
        :pswitch_22
        :pswitch_21
        :pswitch_20
        :pswitch_1f
        :pswitch_1e
        :pswitch_1d
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public f(Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 4

    .line 1
    iget-object v0, p0, Lxa/G;->a:[I

    .line 2
    .line 3
    array-length v0, v0

    .line 4
    const/4 v1, 0x0

    .line 5
    move v2, v1

    .line 6
    :goto_0
    if-ge v2, v0, :cond_1

    .line 7
    .line 8
    invoke-direct {p0, p1, p2, v2}, Lxa/G;->j(Ljava/lang/Object;Ljava/lang/Object;I)Z

    .line 9
    .line 10
    .line 11
    move-result v3

    .line 12
    if-nez v3, :cond_0

    .line 13
    .line 14
    return v1

    .line 15
    :cond_0
    add-int/lit8 v2, v2, 0x3

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_1
    iget-object v0, p0, Lxa/G;->o:Lxa/Y;

    .line 19
    .line 20
    invoke-virtual {v0, p1}, Lxa/Y;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    iget-object v2, p0, Lxa/G;->o:Lxa/Y;

    .line 25
    .line 26
    invoke-virtual {v2, p2}, Lxa/Y;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v2

    .line 30
    invoke-virtual {v0, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    if-nez v0, :cond_2

    .line 35
    .line 36
    return v1

    .line 37
    :cond_2
    iget-boolean v0, p0, Lxa/G;->f:Z

    .line 38
    .line 39
    if-eqz v0, :cond_3

    .line 40
    .line 41
    iget-object v0, p0, Lxa/G;->p:Lxa/k;

    .line 42
    .line 43
    invoke-virtual {v0, p1}, Lxa/k;->b(Ljava/lang/Object;)Lxa/n;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    iget-object v0, p0, Lxa/G;->p:Lxa/k;

    .line 48
    .line 49
    invoke-virtual {v0, p2}, Lxa/k;->b(Ljava/lang/Object;)Lxa/n;

    .line 50
    .line 51
    .line 52
    move-result-object p2

    .line 53
    invoke-virtual {p1, p2}, Lxa/n;->equals(Ljava/lang/Object;)Z

    .line 54
    .line 55
    .line 56
    move-result p1

    .line 57
    return p1

    .line 58
    :cond_3
    const/4 p1, 0x1

    .line 59
    return p1
.end method

.method public g(Ljava/lang/Object;Lxa/Q;Lxa/j;)V
    .locals 6

    .line 1
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-static {p1}, Lxa/G;->i(Ljava/lang/Object;)V

    .line 5
    .line 6
    .line 7
    iget-object v1, p0, Lxa/G;->o:Lxa/Y;

    .line 8
    .line 9
    iget-object v2, p0, Lxa/G;->p:Lxa/k;

    .line 10
    .line 11
    move-object v0, p0

    .line 12
    move-object v3, p1

    .line 13
    move-object v4, p2

    .line 14
    move-object v5, p3

    .line 15
    invoke-direct/range {v0 .. v5}, Lxa/G;->y(Lxa/Y;Lxa/k;Ljava/lang/Object;Lxa/Q;Lxa/j;)V

    .line 16
    .line 17
    .line 18
    return-void
.end method
