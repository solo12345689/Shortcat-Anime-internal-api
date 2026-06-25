.class final LV0/l0;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# instance fields
.field private final a:Ljava/lang/CharSequence;

.field private final b:I

.field private final c:I

.field private final d:Landroid/text/TextPaint;

.field private final e:I

.field private final f:Landroid/text/TextDirectionHeuristic;

.field private final g:Landroid/text/Layout$Alignment;

.field private final h:I

.field private final i:Landroid/text/TextUtils$TruncateAt;

.field private final j:I

.field private final k:F

.field private final l:F

.field private final m:I

.field private final n:Z

.field private final o:Z

.field private final p:I

.field private final q:I

.field private final r:I

.field private final s:I

.field private final t:[I

.field private final u:[I


# direct methods
.method public constructor <init>(Ljava/lang/CharSequence;IILandroid/text/TextPaint;ILandroid/text/TextDirectionHeuristic;Landroid/text/Layout$Alignment;ILandroid/text/TextUtils$TruncateAt;IFFIZZIIII[I[I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LV0/l0;->a:Ljava/lang/CharSequence;

    .line 5
    .line 6
    iput p2, p0, LV0/l0;->b:I

    .line 7
    .line 8
    iput p3, p0, LV0/l0;->c:I

    .line 9
    .line 10
    iput-object p4, p0, LV0/l0;->d:Landroid/text/TextPaint;

    .line 11
    .line 12
    iput p5, p0, LV0/l0;->e:I

    .line 13
    .line 14
    iput-object p6, p0, LV0/l0;->f:Landroid/text/TextDirectionHeuristic;

    .line 15
    .line 16
    iput-object p7, p0, LV0/l0;->g:Landroid/text/Layout$Alignment;

    .line 17
    .line 18
    iput p8, p0, LV0/l0;->h:I

    .line 19
    .line 20
    iput-object p9, p0, LV0/l0;->i:Landroid/text/TextUtils$TruncateAt;

    .line 21
    .line 22
    iput p10, p0, LV0/l0;->j:I

    .line 23
    .line 24
    iput p11, p0, LV0/l0;->k:F

    .line 25
    .line 26
    iput p12, p0, LV0/l0;->l:F

    .line 27
    .line 28
    iput p13, p0, LV0/l0;->m:I

    .line 29
    .line 30
    move p4, p14

    .line 31
    iput-boolean p4, p0, LV0/l0;->n:Z

    .line 32
    .line 33
    move p4, p15

    .line 34
    iput-boolean p4, p0, LV0/l0;->o:Z

    .line 35
    .line 36
    move/from16 p4, p16

    .line 37
    .line 38
    iput p4, p0, LV0/l0;->p:I

    .line 39
    .line 40
    move/from16 p4, p17

    .line 41
    .line 42
    iput p4, p0, LV0/l0;->q:I

    .line 43
    .line 44
    move/from16 p4, p18

    .line 45
    .line 46
    iput p4, p0, LV0/l0;->r:I

    .line 47
    .line 48
    move/from16 p4, p19

    .line 49
    .line 50
    iput p4, p0, LV0/l0;->s:I

    .line 51
    .line 52
    move-object/from16 p4, p20

    .line 53
    .line 54
    iput-object p4, p0, LV0/l0;->t:[I

    .line 55
    .line 56
    move-object/from16 p4, p21

    .line 57
    .line 58
    iput-object p4, p0, LV0/l0;->u:[I

    .line 59
    .line 60
    const/4 p4, 0x1

    .line 61
    const/4 p6, 0x0

    .line 62
    if-ltz p2, :cond_0

    .line 63
    .line 64
    if-gt p2, p3, :cond_0

    .line 65
    .line 66
    move p2, p4

    .line 67
    goto :goto_0

    .line 68
    :cond_0
    move p2, p6

    .line 69
    :goto_0
    if-nez p2, :cond_1

    .line 70
    .line 71
    const-string p2, "invalid start value"

    .line 72
    .line 73
    invoke-static {p2}, Lb1/a;->a(Ljava/lang/String;)V

    .line 74
    .line 75
    .line 76
    :cond_1
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    .line 77
    .line 78
    .line 79
    move-result p1

    .line 80
    if-ltz p3, :cond_2

    .line 81
    .line 82
    if-gt p3, p1, :cond_2

    .line 83
    .line 84
    move p1, p4

    .line 85
    goto :goto_1

    .line 86
    :cond_2
    move p1, p6

    .line 87
    :goto_1
    if-nez p1, :cond_3

    .line 88
    .line 89
    const-string p1, "invalid end value"

    .line 90
    .line 91
    invoke-static {p1}, Lb1/a;->a(Ljava/lang/String;)V

    .line 92
    .line 93
    .line 94
    :cond_3
    if-ltz p8, :cond_4

    .line 95
    .line 96
    move p1, p4

    .line 97
    goto :goto_2

    .line 98
    :cond_4
    move p1, p6

    .line 99
    :goto_2
    if-nez p1, :cond_5

    .line 100
    .line 101
    const-string p1, "invalid maxLines value"

    .line 102
    .line 103
    invoke-static {p1}, Lb1/a;->a(Ljava/lang/String;)V

    .line 104
    .line 105
    .line 106
    :cond_5
    if-ltz p5, :cond_6

    .line 107
    .line 108
    move p1, p4

    .line 109
    goto :goto_3

    .line 110
    :cond_6
    move p1, p6

    .line 111
    :goto_3
    if-nez p1, :cond_7

    .line 112
    .line 113
    const-string p1, "invalid width value"

    .line 114
    .line 115
    invoke-static {p1}, Lb1/a;->a(Ljava/lang/String;)V

    .line 116
    .line 117
    .line 118
    :cond_7
    if-ltz p10, :cond_8

    .line 119
    .line 120
    move p1, p4

    .line 121
    goto :goto_4

    .line 122
    :cond_8
    move p1, p6

    .line 123
    :goto_4
    if-nez p1, :cond_9

    .line 124
    .line 125
    const-string p1, "invalid ellipsizedWidth value"

    .line 126
    .line 127
    invoke-static {p1}, Lb1/a;->a(Ljava/lang/String;)V

    .line 128
    .line 129
    .line 130
    :cond_9
    const/4 p1, 0x0

    .line 131
    cmpl-float p1, p11, p1

    .line 132
    .line 133
    if-ltz p1, :cond_a

    .line 134
    .line 135
    goto :goto_5

    .line 136
    :cond_a
    move p4, p6

    .line 137
    :goto_5
    if-nez p4, :cond_b

    .line 138
    .line 139
    const-string p1, "invalid lineSpacingMultiplier value"

    .line 140
    .line 141
    invoke-static {p1}, Lb1/a;->a(Ljava/lang/String;)V

    .line 142
    .line 143
    .line 144
    :cond_b
    return-void
.end method


# virtual methods
.method public final a()Landroid/text/Layout$Alignment;
    .locals 1

    .line 1
    iget-object v0, p0, LV0/l0;->g:Landroid/text/Layout$Alignment;

    .line 2
    .line 3
    return-object v0
.end method

.method public final b()I
    .locals 1

    .line 1
    iget v0, p0, LV0/l0;->p:I

    .line 2
    .line 3
    return v0
.end method

.method public final c()Landroid/text/TextUtils$TruncateAt;
    .locals 1

    .line 1
    iget-object v0, p0, LV0/l0;->i:Landroid/text/TextUtils$TruncateAt;

    .line 2
    .line 3
    return-object v0
.end method

.method public final d()I
    .locals 1

    .line 1
    iget v0, p0, LV0/l0;->j:I

    .line 2
    .line 3
    return v0
.end method

.method public final e()I
    .locals 1

    .line 1
    iget v0, p0, LV0/l0;->c:I

    .line 2
    .line 3
    return v0
.end method

.method public final f()I
    .locals 1

    .line 1
    iget v0, p0, LV0/l0;->s:I

    .line 2
    .line 3
    return v0
.end method

.method public final g()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, LV0/l0;->n:Z

    .line 2
    .line 3
    return v0
.end method

.method public final h()I
    .locals 1

    .line 1
    iget v0, p0, LV0/l0;->m:I

    .line 2
    .line 3
    return v0
.end method

.method public final i()[I
    .locals 1

    .line 1
    iget-object v0, p0, LV0/l0;->t:[I

    .line 2
    .line 3
    return-object v0
.end method

.method public final j()I
    .locals 1

    .line 1
    iget v0, p0, LV0/l0;->q:I

    .line 2
    .line 3
    return v0
.end method

.method public final k()I
    .locals 1

    .line 1
    iget v0, p0, LV0/l0;->r:I

    .line 2
    .line 3
    return v0
.end method

.method public final l()F
    .locals 1

    .line 1
    iget v0, p0, LV0/l0;->l:F

    .line 2
    .line 3
    return v0
.end method

.method public final m()F
    .locals 1

    .line 1
    iget v0, p0, LV0/l0;->k:F

    .line 2
    .line 3
    return v0
.end method

.method public final n()I
    .locals 1

    .line 1
    iget v0, p0, LV0/l0;->h:I

    .line 2
    .line 3
    return v0
.end method

.method public final o()Landroid/text/TextPaint;
    .locals 1

    .line 1
    iget-object v0, p0, LV0/l0;->d:Landroid/text/TextPaint;

    .line 2
    .line 3
    return-object v0
.end method

.method public final p()[I
    .locals 1

    .line 1
    iget-object v0, p0, LV0/l0;->u:[I

    .line 2
    .line 3
    return-object v0
.end method

.method public final q()I
    .locals 1

    .line 1
    iget v0, p0, LV0/l0;->b:I

    .line 2
    .line 3
    return v0
.end method

.method public final r()Ljava/lang/CharSequence;
    .locals 1

    .line 1
    iget-object v0, p0, LV0/l0;->a:Ljava/lang/CharSequence;

    .line 2
    .line 3
    return-object v0
.end method

.method public final s()Landroid/text/TextDirectionHeuristic;
    .locals 1

    .line 1
    iget-object v0, p0, LV0/l0;->f:Landroid/text/TextDirectionHeuristic;

    .line 2
    .line 3
    return-object v0
.end method

.method public final t()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, LV0/l0;->o:Z

    .line 2
    .line 3
    return v0
.end method

.method public final u()I
    .locals 1

    .line 1
    iget v0, p0, LV0/l0;->e:I

    .line 2
    .line 3
    return v0
.end method
