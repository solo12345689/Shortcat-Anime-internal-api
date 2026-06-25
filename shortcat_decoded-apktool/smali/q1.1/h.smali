.class public Lq1/h;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# static fields
.field public static v:F = NaNf


# instance fields
.field public a:Lt1/e;

.field public b:I

.field public c:I

.field public d:I

.field public e:I

.field public f:F

.field public g:F

.field public h:F

.field public i:F

.field public j:F

.field public k:F

.field public l:F

.field public m:F

.field public n:F

.field public o:F

.field public p:F

.field public q:F

.field public r:I

.field private final s:Ljava/util/HashMap;

.field public t:Ljava/lang/String;

.field u:Lo1/b;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    .line 1
    return-void
.end method

.method public constructor <init>(Lq1/h;)V
    .locals 3

    .line 23
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 24
    iput-object v0, p0, Lq1/h;->a:Lt1/e;

    const/4 v1, 0x0

    .line 25
    iput v1, p0, Lq1/h;->b:I

    .line 26
    iput v1, p0, Lq1/h;->c:I

    .line 27
    iput v1, p0, Lq1/h;->d:I

    .line 28
    iput v1, p0, Lq1/h;->e:I

    const/high16 v2, 0x7fc00000    # Float.NaN

    .line 29
    iput v2, p0, Lq1/h;->f:F

    .line 30
    iput v2, p0, Lq1/h;->g:F

    .line 31
    iput v2, p0, Lq1/h;->h:F

    .line 32
    iput v2, p0, Lq1/h;->i:F

    .line 33
    iput v2, p0, Lq1/h;->j:F

    .line 34
    iput v2, p0, Lq1/h;->k:F

    .line 35
    iput v2, p0, Lq1/h;->l:F

    .line 36
    iput v2, p0, Lq1/h;->m:F

    .line 37
    iput v2, p0, Lq1/h;->n:F

    .line 38
    iput v2, p0, Lq1/h;->o:F

    .line 39
    iput v2, p0, Lq1/h;->p:F

    .line 40
    iput v2, p0, Lq1/h;->q:F

    .line 41
    iput v1, p0, Lq1/h;->r:I

    .line 42
    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    iput-object v1, p0, Lq1/h;->s:Ljava/util/HashMap;

    .line 43
    iput-object v0, p0, Lq1/h;->t:Ljava/lang/String;

    .line 44
    iget-object v0, p1, Lq1/h;->a:Lt1/e;

    iput-object v0, p0, Lq1/h;->a:Lt1/e;

    .line 45
    iget v0, p1, Lq1/h;->b:I

    iput v0, p0, Lq1/h;->b:I

    .line 46
    iget v0, p1, Lq1/h;->c:I

    iput v0, p0, Lq1/h;->c:I

    .line 47
    iget v0, p1, Lq1/h;->d:I

    iput v0, p0, Lq1/h;->d:I

    .line 48
    iget v0, p1, Lq1/h;->e:I

    iput v0, p0, Lq1/h;->e:I

    .line 49
    invoke-virtual {p0, p1}, Lq1/h;->k(Lq1/h;)V

    return-void
.end method

.method public constructor <init>(Lt1/e;)V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, Lq1/h;->a:Lt1/e;

    const/4 v1, 0x0

    .line 3
    iput v1, p0, Lq1/h;->b:I

    .line 4
    iput v1, p0, Lq1/h;->c:I

    .line 5
    iput v1, p0, Lq1/h;->d:I

    .line 6
    iput v1, p0, Lq1/h;->e:I

    const/high16 v2, 0x7fc00000    # Float.NaN

    .line 7
    iput v2, p0, Lq1/h;->f:F

    .line 8
    iput v2, p0, Lq1/h;->g:F

    .line 9
    iput v2, p0, Lq1/h;->h:F

    .line 10
    iput v2, p0, Lq1/h;->i:F

    .line 11
    iput v2, p0, Lq1/h;->j:F

    .line 12
    iput v2, p0, Lq1/h;->k:F

    .line 13
    iput v2, p0, Lq1/h;->l:F

    .line 14
    iput v2, p0, Lq1/h;->m:F

    .line 15
    iput v2, p0, Lq1/h;->n:F

    .line 16
    iput v2, p0, Lq1/h;->o:F

    .line 17
    iput v2, p0, Lq1/h;->p:F

    .line 18
    iput v2, p0, Lq1/h;->q:F

    .line 19
    iput v1, p0, Lq1/h;->r:I

    .line 20
    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    iput-object v1, p0, Lq1/h;->s:Ljava/util/HashMap;

    .line 21
    iput-object v0, p0, Lq1/h;->t:Ljava/lang/String;

    .line 22
    iput-object p1, p0, Lq1/h;->a:Lt1/e;

    return-void
.end method

.method private static a(Ljava/lang/StringBuilder;Ljava/lang/String;F)V
    .locals 1

    .line 1
    invoke-static {p2}, Ljava/lang/Float;->isNaN(F)Z

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
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    const-string p1, ": "

    .line 12
    .line 13
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0, p2}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 17
    .line 18
    .line 19
    const-string p1, ",\n"

    .line 20
    .line 21
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    return-void
.end method

.method private static b(Ljava/lang/StringBuilder;Ljava/lang/String;I)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2
    .line 3
    .line 4
    const-string p1, ": "

    .line 5
    .line 6
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 10
    .line 11
    .line 12
    const-string p1, ",\n"

    .line 13
    .line 14
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method private f(Ljava/lang/StringBuilder;Lt1/d$a;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lq1/h;->a:Lt1/e;

    .line 2
    .line 3
    invoke-virtual {v0, p2}, Lt1/e;->o(Lt1/d$a;)Lt1/d;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-eqz v0, :cond_2

    .line 8
    .line 9
    iget-object v1, v0, Lt1/d;->f:Lt1/d;

    .line 10
    .line 11
    if-nez v1, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    const-string v1, "Anchor"

    .line 15
    .line 16
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 17
    .line 18
    .line 19
    invoke-virtual {p2}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object p2

    .line 23
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    const-string p2, ": [\'"

    .line 27
    .line 28
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    iget-object p2, v0, Lt1/d;->f:Lt1/d;

    .line 32
    .line 33
    invoke-virtual {p2}, Lt1/d;->h()Lt1/e;

    .line 34
    .line 35
    .line 36
    move-result-object p2

    .line 37
    iget-object p2, p2, Lt1/e;->o:Ljava/lang/String;

    .line 38
    .line 39
    if-nez p2, :cond_1

    .line 40
    .line 41
    const-string p2, "#PARENT"

    .line 42
    .line 43
    :cond_1
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    .line 46
    const-string p2, "\', \'"

    .line 47
    .line 48
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 49
    .line 50
    .line 51
    iget-object v1, v0, Lt1/d;->f:Lt1/d;

    .line 52
    .line 53
    invoke-virtual {v1}, Lt1/d;->k()Lt1/d$a;

    .line 54
    .line 55
    .line 56
    move-result-object v1

    .line 57
    invoke-virtual {v1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object v1

    .line 61
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 62
    .line 63
    .line 64
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 65
    .line 66
    .line 67
    iget p2, v0, Lt1/d;->g:I

    .line 68
    .line 69
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 70
    .line 71
    .line 72
    const-string p2, "\'],\n"

    .line 73
    .line 74
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 75
    .line 76
    .line 77
    :cond_2
    :goto_0
    return-void
.end method


# virtual methods
.method public c()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lq1/h;->a:Lt1/e;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const-string v0, "unknown"

    .line 6
    .line 7
    return-object v0

    .line 8
    :cond_0
    iget-object v0, v0, Lt1/e;->o:Ljava/lang/String;

    .line 9
    .line 10
    return-object v0
.end method

.method public d()Z
    .locals 1

    .line 1
    iget v0, p0, Lq1/h;->h:F

    .line 2
    .line 3
    invoke-static {v0}, Ljava/lang/Float;->isNaN(F)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    iget v0, p0, Lq1/h;->i:F

    .line 10
    .line 11
    invoke-static {v0}, Ljava/lang/Float;->isNaN(F)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    iget v0, p0, Lq1/h;->j:F

    .line 18
    .line 19
    invoke-static {v0}, Ljava/lang/Float;->isNaN(F)Z

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    if-eqz v0, :cond_0

    .line 24
    .line 25
    iget v0, p0, Lq1/h;->k:F

    .line 26
    .line 27
    invoke-static {v0}, Ljava/lang/Float;->isNaN(F)Z

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    if-eqz v0, :cond_0

    .line 32
    .line 33
    iget v0, p0, Lq1/h;->l:F

    .line 34
    .line 35
    invoke-static {v0}, Ljava/lang/Float;->isNaN(F)Z

    .line 36
    .line 37
    .line 38
    move-result v0

    .line 39
    if-eqz v0, :cond_0

    .line 40
    .line 41
    iget v0, p0, Lq1/h;->m:F

    .line 42
    .line 43
    invoke-static {v0}, Ljava/lang/Float;->isNaN(F)Z

    .line 44
    .line 45
    .line 46
    move-result v0

    .line 47
    if-eqz v0, :cond_0

    .line 48
    .line 49
    iget v0, p0, Lq1/h;->n:F

    .line 50
    .line 51
    invoke-static {v0}, Ljava/lang/Float;->isNaN(F)Z

    .line 52
    .line 53
    .line 54
    move-result v0

    .line 55
    if-eqz v0, :cond_0

    .line 56
    .line 57
    iget v0, p0, Lq1/h;->o:F

    .line 58
    .line 59
    invoke-static {v0}, Ljava/lang/Float;->isNaN(F)Z

    .line 60
    .line 61
    .line 62
    move-result v0

    .line 63
    if-eqz v0, :cond_0

    .line 64
    .line 65
    iget v0, p0, Lq1/h;->p:F

    .line 66
    .line 67
    invoke-static {v0}, Ljava/lang/Float;->isNaN(F)Z

    .line 68
    .line 69
    .line 70
    move-result v0

    .line 71
    if-eqz v0, :cond_0

    .line 72
    .line 73
    const/4 v0, 0x1

    .line 74
    return v0

    .line 75
    :cond_0
    const/4 v0, 0x0

    .line 76
    return v0
.end method

.method public e(Ljava/lang/StringBuilder;Z)Ljava/lang/StringBuilder;
    .locals 6

    .line 1
    const-string v0, "{\n"

    .line 2
    .line 3
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 4
    .line 5
    .line 6
    const-string v0, "left"

    .line 7
    .line 8
    iget v1, p0, Lq1/h;->b:I

    .line 9
    .line 10
    invoke-static {p1, v0, v1}, Lq1/h;->b(Ljava/lang/StringBuilder;Ljava/lang/String;I)V

    .line 11
    .line 12
    .line 13
    const-string v0, "top"

    .line 14
    .line 15
    iget v1, p0, Lq1/h;->c:I

    .line 16
    .line 17
    invoke-static {p1, v0, v1}, Lq1/h;->b(Ljava/lang/StringBuilder;Ljava/lang/String;I)V

    .line 18
    .line 19
    .line 20
    const-string v0, "right"

    .line 21
    .line 22
    iget v1, p0, Lq1/h;->d:I

    .line 23
    .line 24
    invoke-static {p1, v0, v1}, Lq1/h;->b(Ljava/lang/StringBuilder;Ljava/lang/String;I)V

    .line 25
    .line 26
    .line 27
    const-string v0, "bottom"

    .line 28
    .line 29
    iget v1, p0, Lq1/h;->e:I

    .line 30
    .line 31
    invoke-static {p1, v0, v1}, Lq1/h;->b(Ljava/lang/StringBuilder;Ljava/lang/String;I)V

    .line 32
    .line 33
    .line 34
    const-string v0, "pivotX"

    .line 35
    .line 36
    iget v1, p0, Lq1/h;->f:F

    .line 37
    .line 38
    invoke-static {p1, v0, v1}, Lq1/h;->a(Ljava/lang/StringBuilder;Ljava/lang/String;F)V

    .line 39
    .line 40
    .line 41
    const-string v0, "pivotY"

    .line 42
    .line 43
    iget v1, p0, Lq1/h;->g:F

    .line 44
    .line 45
    invoke-static {p1, v0, v1}, Lq1/h;->a(Ljava/lang/StringBuilder;Ljava/lang/String;F)V

    .line 46
    .line 47
    .line 48
    const-string v0, "rotationX"

    .line 49
    .line 50
    iget v1, p0, Lq1/h;->h:F

    .line 51
    .line 52
    invoke-static {p1, v0, v1}, Lq1/h;->a(Ljava/lang/StringBuilder;Ljava/lang/String;F)V

    .line 53
    .line 54
    .line 55
    const-string v0, "rotationY"

    .line 56
    .line 57
    iget v1, p0, Lq1/h;->i:F

    .line 58
    .line 59
    invoke-static {p1, v0, v1}, Lq1/h;->a(Ljava/lang/StringBuilder;Ljava/lang/String;F)V

    .line 60
    .line 61
    .line 62
    const-string v0, "rotationZ"

    .line 63
    .line 64
    iget v1, p0, Lq1/h;->j:F

    .line 65
    .line 66
    invoke-static {p1, v0, v1}, Lq1/h;->a(Ljava/lang/StringBuilder;Ljava/lang/String;F)V

    .line 67
    .line 68
    .line 69
    const-string v0, "translationX"

    .line 70
    .line 71
    iget v1, p0, Lq1/h;->k:F

    .line 72
    .line 73
    invoke-static {p1, v0, v1}, Lq1/h;->a(Ljava/lang/StringBuilder;Ljava/lang/String;F)V

    .line 74
    .line 75
    .line 76
    const-string v0, "translationY"

    .line 77
    .line 78
    iget v1, p0, Lq1/h;->l:F

    .line 79
    .line 80
    invoke-static {p1, v0, v1}, Lq1/h;->a(Ljava/lang/StringBuilder;Ljava/lang/String;F)V

    .line 81
    .line 82
    .line 83
    const-string v0, "translationZ"

    .line 84
    .line 85
    iget v1, p0, Lq1/h;->m:F

    .line 86
    .line 87
    invoke-static {p1, v0, v1}, Lq1/h;->a(Ljava/lang/StringBuilder;Ljava/lang/String;F)V

    .line 88
    .line 89
    .line 90
    const-string v0, "scaleX"

    .line 91
    .line 92
    iget v1, p0, Lq1/h;->n:F

    .line 93
    .line 94
    invoke-static {p1, v0, v1}, Lq1/h;->a(Ljava/lang/StringBuilder;Ljava/lang/String;F)V

    .line 95
    .line 96
    .line 97
    const-string v0, "scaleY"

    .line 98
    .line 99
    iget v1, p0, Lq1/h;->o:F

    .line 100
    .line 101
    invoke-static {p1, v0, v1}, Lq1/h;->a(Ljava/lang/StringBuilder;Ljava/lang/String;F)V

    .line 102
    .line 103
    .line 104
    const-string v0, "alpha"

    .line 105
    .line 106
    iget v1, p0, Lq1/h;->p:F

    .line 107
    .line 108
    invoke-static {p1, v0, v1}, Lq1/h;->a(Ljava/lang/StringBuilder;Ljava/lang/String;F)V

    .line 109
    .line 110
    .line 111
    const-string v0, "visibility"

    .line 112
    .line 113
    iget v1, p0, Lq1/h;->r:I

    .line 114
    .line 115
    invoke-static {p1, v0, v1}, Lq1/h;->b(Ljava/lang/StringBuilder;Ljava/lang/String;I)V

    .line 116
    .line 117
    .line 118
    const-string v0, "interpolatedPos"

    .line 119
    .line 120
    iget v1, p0, Lq1/h;->q:F

    .line 121
    .line 122
    invoke-static {p1, v0, v1}, Lq1/h;->a(Ljava/lang/StringBuilder;Ljava/lang/String;F)V

    .line 123
    .line 124
    .line 125
    iget-object v0, p0, Lq1/h;->a:Lt1/e;

    .line 126
    .line 127
    if-eqz v0, :cond_0

    .line 128
    .line 129
    invoke-static {}, Lt1/d$a;->values()[Lt1/d$a;

    .line 130
    .line 131
    .line 132
    move-result-object v0

    .line 133
    array-length v1, v0

    .line 134
    const/4 v2, 0x0

    .line 135
    :goto_0
    if-ge v2, v1, :cond_0

    .line 136
    .line 137
    aget-object v3, v0, v2

    .line 138
    .line 139
    invoke-direct {p0, p1, v3}, Lq1/h;->f(Ljava/lang/StringBuilder;Lt1/d$a;)V

    .line 140
    .line 141
    .line 142
    add-int/lit8 v2, v2, 0x1

    .line 143
    .line 144
    goto :goto_0

    .line 145
    :cond_0
    const-string v0, "phone_orientation"

    .line 146
    .line 147
    if-eqz p2, :cond_1

    .line 148
    .line 149
    sget v1, Lq1/h;->v:F

    .line 150
    .line 151
    invoke-static {p1, v0, v1}, Lq1/h;->a(Ljava/lang/StringBuilder;Ljava/lang/String;F)V

    .line 152
    .line 153
    .line 154
    :cond_1
    if-eqz p2, :cond_2

    .line 155
    .line 156
    sget p2, Lq1/h;->v:F

    .line 157
    .line 158
    invoke-static {p1, v0, p2}, Lq1/h;->a(Ljava/lang/StringBuilder;Ljava/lang/String;F)V

    .line 159
    .line 160
    .line 161
    :cond_2
    iget-object p2, p0, Lq1/h;->s:Ljava/util/HashMap;

    .line 162
    .line 163
    invoke-virtual {p2}, Ljava/util/HashMap;->size()I

    .line 164
    .line 165
    .line 166
    move-result p2

    .line 167
    const-string v0, "}\n"

    .line 168
    .line 169
    if-eqz p2, :cond_4

    .line 170
    .line 171
    const-string p2, "custom : {\n"

    .line 172
    .line 173
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 174
    .line 175
    .line 176
    iget-object p2, p0, Lq1/h;->s:Ljava/util/HashMap;

    .line 177
    .line 178
    invoke-virtual {p2}, Ljava/util/HashMap;->keySet()Ljava/util/Set;

    .line 179
    .line 180
    .line 181
    move-result-object p2

    .line 182
    invoke-interface {p2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 183
    .line 184
    .line 185
    move-result-object p2

    .line 186
    :goto_1
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 187
    .line 188
    .line 189
    move-result v1

    .line 190
    if-eqz v1, :cond_3

    .line 191
    .line 192
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 193
    .line 194
    .line 195
    move-result-object v1

    .line 196
    check-cast v1, Ljava/lang/String;

    .line 197
    .line 198
    iget-object v2, p0, Lq1/h;->s:Ljava/util/HashMap;

    .line 199
    .line 200
    invoke-virtual {v2, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 201
    .line 202
    .line 203
    move-result-object v2

    .line 204
    check-cast v2, Ln1/a;

    .line 205
    .line 206
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 207
    .line 208
    .line 209
    const-string v1, ": "

    .line 210
    .line 211
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 212
    .line 213
    .line 214
    invoke-virtual {v2}, Ln1/a;->h()I

    .line 215
    .line 216
    .line 217
    move-result v1

    .line 218
    const-string v3, ",\n"

    .line 219
    .line 220
    const-string v4, "\',\n"

    .line 221
    .line 222
    const-string v5, "\'"

    .line 223
    .line 224
    packed-switch v1, :pswitch_data_0

    .line 225
    .line 226
    .line 227
    goto :goto_1

    .line 228
    :pswitch_0
    invoke-virtual {p1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 229
    .line 230
    .line 231
    invoke-virtual {v2}, Ln1/a;->c()Z

    .line 232
    .line 233
    .line 234
    move-result v1

    .line 235
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 236
    .line 237
    .line 238
    invoke-virtual {p1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 239
    .line 240
    .line 241
    goto :goto_1

    .line 242
    :pswitch_1
    invoke-virtual {p1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 243
    .line 244
    .line 245
    invoke-virtual {v2}, Ln1/a;->g()Ljava/lang/String;

    .line 246
    .line 247
    .line 248
    move-result-object v1

    .line 249
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 250
    .line 251
    .line 252
    invoke-virtual {p1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 253
    .line 254
    .line 255
    goto :goto_1

    .line 256
    :pswitch_2
    invoke-virtual {p1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 257
    .line 258
    .line 259
    invoke-virtual {v2}, Ln1/a;->e()I

    .line 260
    .line 261
    .line 262
    move-result v1

    .line 263
    invoke-static {v1}, Ln1/a;->a(I)Ljava/lang/String;

    .line 264
    .line 265
    .line 266
    move-result-object v1

    .line 267
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 268
    .line 269
    .line 270
    invoke-virtual {p1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 271
    .line 272
    .line 273
    goto :goto_1

    .line 274
    :pswitch_3
    invoke-virtual {v2}, Ln1/a;->d()F

    .line 275
    .line 276
    .line 277
    move-result v1

    .line 278
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 279
    .line 280
    .line 281
    invoke-virtual {p1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 282
    .line 283
    .line 284
    goto :goto_1

    .line 285
    :pswitch_4
    invoke-virtual {v2}, Ln1/a;->e()I

    .line 286
    .line 287
    .line 288
    move-result v1

    .line 289
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 290
    .line 291
    .line 292
    invoke-virtual {p1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 293
    .line 294
    .line 295
    goto :goto_1

    .line 296
    :cond_3
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 297
    .line 298
    .line 299
    :cond_4
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 300
    .line 301
    .line 302
    return-object p1

    .line 303
    :pswitch_data_0
    .packed-switch 0x384
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
        :pswitch_3
    .end packed-switch
.end method

.method public g(Ljava/lang/String;IF)V
    .locals 2

    .line 1
    iget-object v0, p0, Lq1/h;->s:Ljava/util/HashMap;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    iget-object p2, p0, Lq1/h;->s:Ljava/util/HashMap;

    .line 10
    .line 11
    invoke-virtual {p2, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    check-cast p1, Ln1/a;

    .line 16
    .line 17
    invoke-virtual {p1, p3}, Ln1/a;->i(F)V

    .line 18
    .line 19
    .line 20
    return-void

    .line 21
    :cond_0
    iget-object v0, p0, Lq1/h;->s:Ljava/util/HashMap;

    .line 22
    .line 23
    new-instance v1, Ln1/a;

    .line 24
    .line 25
    invoke-direct {v1, p1, p2, p3}, Ln1/a;-><init>(Ljava/lang/String;IF)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0, p1, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    return-void
.end method

.method public h(Ljava/lang/String;II)V
    .locals 2

    .line 1
    iget-object v0, p0, Lq1/h;->s:Ljava/util/HashMap;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    iget-object p2, p0, Lq1/h;->s:Ljava/util/HashMap;

    .line 10
    .line 11
    invoke-virtual {p2, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    check-cast p1, Ln1/a;

    .line 16
    .line 17
    invoke-virtual {p1, p3}, Ln1/a;->j(I)V

    .line 18
    .line 19
    .line 20
    return-void

    .line 21
    :cond_0
    iget-object v0, p0, Lq1/h;->s:Ljava/util/HashMap;

    .line 22
    .line 23
    new-instance v1, Ln1/a;

    .line 24
    .line 25
    invoke-direct {v1, p1, p2, p3}, Ln1/a;-><init>(Ljava/lang/String;II)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0, p1, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    return-void
.end method

.method i(Lo1/b;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lq1/h;->u:Lo1/b;

    .line 2
    .line 3
    return-void
.end method

.method public j()Lq1/h;
    .locals 1

    .line 1
    iget-object v0, p0, Lq1/h;->a:Lt1/e;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Lt1/e;->E()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    iput v0, p0, Lq1/h;->b:I

    .line 10
    .line 11
    iget-object v0, p0, Lq1/h;->a:Lt1/e;

    .line 12
    .line 13
    invoke-virtual {v0}, Lt1/e;->P()I

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    iput v0, p0, Lq1/h;->c:I

    .line 18
    .line 19
    iget-object v0, p0, Lq1/h;->a:Lt1/e;

    .line 20
    .line 21
    invoke-virtual {v0}, Lt1/e;->N()I

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    iput v0, p0, Lq1/h;->d:I

    .line 26
    .line 27
    iget-object v0, p0, Lq1/h;->a:Lt1/e;

    .line 28
    .line 29
    invoke-virtual {v0}, Lt1/e;->r()I

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    iput v0, p0, Lq1/h;->e:I

    .line 34
    .line 35
    iget-object v0, p0, Lq1/h;->a:Lt1/e;

    .line 36
    .line 37
    iget-object v0, v0, Lt1/e;->n:Lq1/h;

    .line 38
    .line 39
    invoke-virtual {p0, v0}, Lq1/h;->k(Lq1/h;)V

    .line 40
    .line 41
    .line 42
    :cond_0
    return-object p0
.end method

.method public k(Lq1/h;)V
    .locals 3

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    goto :goto_1

    .line 4
    :cond_0
    iget v0, p1, Lq1/h;->f:F

    .line 5
    .line 6
    iput v0, p0, Lq1/h;->f:F

    .line 7
    .line 8
    iget v0, p1, Lq1/h;->g:F

    .line 9
    .line 10
    iput v0, p0, Lq1/h;->g:F

    .line 11
    .line 12
    iget v0, p1, Lq1/h;->h:F

    .line 13
    .line 14
    iput v0, p0, Lq1/h;->h:F

    .line 15
    .line 16
    iget v0, p1, Lq1/h;->i:F

    .line 17
    .line 18
    iput v0, p0, Lq1/h;->i:F

    .line 19
    .line 20
    iget v0, p1, Lq1/h;->j:F

    .line 21
    .line 22
    iput v0, p0, Lq1/h;->j:F

    .line 23
    .line 24
    iget v0, p1, Lq1/h;->k:F

    .line 25
    .line 26
    iput v0, p0, Lq1/h;->k:F

    .line 27
    .line 28
    iget v0, p1, Lq1/h;->l:F

    .line 29
    .line 30
    iput v0, p0, Lq1/h;->l:F

    .line 31
    .line 32
    iget v0, p1, Lq1/h;->m:F

    .line 33
    .line 34
    iput v0, p0, Lq1/h;->m:F

    .line 35
    .line 36
    iget v0, p1, Lq1/h;->n:F

    .line 37
    .line 38
    iput v0, p0, Lq1/h;->n:F

    .line 39
    .line 40
    iget v0, p1, Lq1/h;->o:F

    .line 41
    .line 42
    iput v0, p0, Lq1/h;->o:F

    .line 43
    .line 44
    iget v0, p1, Lq1/h;->p:F

    .line 45
    .line 46
    iput v0, p0, Lq1/h;->p:F

    .line 47
    .line 48
    iget v0, p1, Lq1/h;->r:I

    .line 49
    .line 50
    iput v0, p0, Lq1/h;->r:I

    .line 51
    .line 52
    iget-object v0, p1, Lq1/h;->u:Lo1/b;

    .line 53
    .line 54
    invoke-virtual {p0, v0}, Lq1/h;->i(Lo1/b;)V

    .line 55
    .line 56
    .line 57
    iget-object v0, p0, Lq1/h;->s:Ljava/util/HashMap;

    .line 58
    .line 59
    invoke-virtual {v0}, Ljava/util/HashMap;->clear()V

    .line 60
    .line 61
    .line 62
    iget-object p1, p1, Lq1/h;->s:Ljava/util/HashMap;

    .line 63
    .line 64
    invoke-virtual {p1}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    .line 65
    .line 66
    .line 67
    move-result-object p1

    .line 68
    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 69
    .line 70
    .line 71
    move-result-object p1

    .line 72
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 73
    .line 74
    .line 75
    move-result v0

    .line 76
    if-eqz v0, :cond_1

    .line 77
    .line 78
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object v0

    .line 82
    check-cast v0, Ln1/a;

    .line 83
    .line 84
    iget-object v1, p0, Lq1/h;->s:Ljava/util/HashMap;

    .line 85
    .line 86
    invoke-virtual {v0}, Ln1/a;->f()Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    move-result-object v2

    .line 90
    invoke-virtual {v0}, Ln1/a;->b()Ln1/a;

    .line 91
    .line 92
    .line 93
    move-result-object v0

    .line 94
    invoke-virtual {v1, v2, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    goto :goto_0

    .line 98
    :cond_1
    :goto_1
    return-void
.end method
