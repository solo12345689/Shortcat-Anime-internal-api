.class public abstract Lcom/google/android/gms/internal/measurement/t4;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lcom/google/android/gms/internal/measurement/D5;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private static f(Ljava/util/List;I)V
    .locals 3

    .line 1
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    sub-int/2addr v0, p1

    .line 6
    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    new-instance v2, Ljava/lang/StringBuilder;

    .line 15
    .line 16
    add-int/lit8 v1, v1, 0x1a

    .line 17
    .line 18
    invoke-direct {v2, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 19
    .line 20
    .line 21
    const-string v1, "Element at index "

    .line 22
    .line 23
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    const-string v0, " is null."

    .line 30
    .line 31
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 39
    .line 40
    .line 41
    move-result v1

    .line 42
    :goto_0
    add-int/lit8 v1, v1, -0x1

    .line 43
    .line 44
    if-lt v1, p1, :cond_0

    .line 45
    .line 46
    invoke-interface {p0, v1}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_0
    new-instance p0, Ljava/lang/NullPointerException;

    .line 51
    .line 52
    invoke-direct {p0, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    throw p0
.end method

.method protected static i(Ljava/lang/Iterable;Ljava/util/List;)V
    .locals 4

    .line 1
    sget-object v0, Lcom/google/android/gms/internal/measurement/k5;->b:[B

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    instance-of v0, p0, Lcom/google/android/gms/internal/measurement/o5;

    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    if-eqz v0, :cond_2

    .line 10
    .line 11
    check-cast p0, Lcom/google/android/gms/internal/measurement/o5;

    .line 12
    .line 13
    invoke-interface {p0}, Lcom/google/android/gms/internal/measurement/o5;->zza()Ljava/util/List;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    invoke-static {p1}, Landroid/support/v4/media/session/b;->a(Ljava/lang/Object;)V

    .line 18
    .line 19
    .line 20
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 21
    .line 22
    .line 23
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 28
    .line 29
    .line 30
    move-result p1

    .line 31
    if-eqz p1, :cond_8

    .line 32
    .line 33
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 38
    .line 39
    .line 40
    instance-of p1, p0, Lcom/google/android/gms/internal/measurement/I4;

    .line 41
    .line 42
    const/4 v0, 0x0

    .line 43
    if-nez p1, :cond_1

    .line 44
    .line 45
    instance-of p1, p0, [B

    .line 46
    .line 47
    if-eqz p1, :cond_0

    .line 48
    .line 49
    check-cast p0, [B

    .line 50
    .line 51
    array-length p1, p0

    .line 52
    invoke-static {p0, v1, p1}, Lcom/google/android/gms/internal/measurement/I4;->l([BII)Lcom/google/android/gms/internal/measurement/I4;

    .line 53
    .line 54
    .line 55
    throw v0

    .line 56
    :cond_0
    check-cast p0, Ljava/lang/String;

    .line 57
    .line 58
    throw v0

    .line 59
    :cond_1
    check-cast p0, Lcom/google/android/gms/internal/measurement/I4;

    .line 60
    .line 61
    throw v0

    .line 62
    :cond_2
    instance-of v0, p0, Lcom/google/android/gms/internal/measurement/L5;

    .line 63
    .line 64
    if-nez v0, :cond_9

    .line 65
    .line 66
    instance-of v0, p0, Ljava/util/Collection;

    .line 67
    .line 68
    if-eqz v0, :cond_4

    .line 69
    .line 70
    move-object v0, p0

    .line 71
    check-cast v0, Ljava/util/Collection;

    .line 72
    .line 73
    invoke-interface {v0}, Ljava/util/Collection;->size()I

    .line 74
    .line 75
    .line 76
    move-result v0

    .line 77
    instance-of v2, p1, Ljava/util/ArrayList;

    .line 78
    .line 79
    if-eqz v2, :cond_3

    .line 80
    .line 81
    move-object v2, p1

    .line 82
    check-cast v2, Ljava/util/ArrayList;

    .line 83
    .line 84
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 85
    .line 86
    .line 87
    move-result v3

    .line 88
    add-int/2addr v3, v0

    .line 89
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->ensureCapacity(I)V

    .line 90
    .line 91
    .line 92
    goto :goto_0

    .line 93
    :cond_3
    instance-of v2, p1, Lcom/google/android/gms/internal/measurement/N5;

    .line 94
    .line 95
    if-eqz v2, :cond_4

    .line 96
    .line 97
    move-object v2, p1

    .line 98
    check-cast v2, Lcom/google/android/gms/internal/measurement/N5;

    .line 99
    .line 100
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 101
    .line 102
    .line 103
    move-result v3

    .line 104
    add-int/2addr v3, v0

    .line 105
    invoke-virtual {v2, v3}, Lcom/google/android/gms/internal/measurement/N5;->d(I)V

    .line 106
    .line 107
    .line 108
    :cond_4
    :goto_0
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 109
    .line 110
    .line 111
    move-result v0

    .line 112
    instance-of v2, p0, Ljava/util/List;

    .line 113
    .line 114
    if-eqz v2, :cond_6

    .line 115
    .line 116
    instance-of v2, p0, Ljava/util/RandomAccess;

    .line 117
    .line 118
    if-eqz v2, :cond_6

    .line 119
    .line 120
    check-cast p0, Ljava/util/List;

    .line 121
    .line 122
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 123
    .line 124
    .line 125
    move-result v2

    .line 126
    :goto_1
    if-ge v1, v2, :cond_8

    .line 127
    .line 128
    invoke-interface {p0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 129
    .line 130
    .line 131
    move-result-object v3

    .line 132
    if-nez v3, :cond_5

    .line 133
    .line 134
    invoke-static {p1, v0}, Lcom/google/android/gms/internal/measurement/t4;->f(Ljava/util/List;I)V

    .line 135
    .line 136
    .line 137
    :cond_5
    invoke-interface {p1, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 138
    .line 139
    .line 140
    add-int/lit8 v1, v1, 0x1

    .line 141
    .line 142
    goto :goto_1

    .line 143
    :cond_6
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 144
    .line 145
    .line 146
    move-result-object p0

    .line 147
    :goto_2
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 148
    .line 149
    .line 150
    move-result v1

    .line 151
    if-eqz v1, :cond_8

    .line 152
    .line 153
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 154
    .line 155
    .line 156
    move-result-object v1

    .line 157
    if-nez v1, :cond_7

    .line 158
    .line 159
    invoke-static {p1, v0}, Lcom/google/android/gms/internal/measurement/t4;->f(Ljava/util/List;I)V

    .line 160
    .line 161
    .line 162
    :cond_7
    invoke-interface {p1, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 163
    .line 164
    .line 165
    goto :goto_2

    .line 166
    :cond_8
    return-void

    .line 167
    :cond_9
    check-cast p0, Ljava/util/Collection;

    .line 168
    .line 169
    invoke-interface {p1, p0}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 170
    .line 171
    .line 172
    return-void
.end method


# virtual methods
.method public final synthetic A1([BLcom/google/android/gms/internal/measurement/R4;)Lcom/google/android/gms/internal/measurement/D5;
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    array-length v1, p1

    .line 3
    invoke-virtual {p0, p1, v0, v1, p2}, Lcom/google/android/gms/internal/measurement/t4;->h([BIILcom/google/android/gms/internal/measurement/R4;)Lcom/google/android/gms/internal/measurement/t4;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method

.method public final synthetic B0([B)Lcom/google/android/gms/internal/measurement/D5;
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    array-length v1, p1

    .line 3
    invoke-virtual {p0, p1, v0, v1}, Lcom/google/android/gms/internal/measurement/t4;->g([BII)Lcom/google/android/gms/internal/measurement/t4;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method

.method public abstract g([BII)Lcom/google/android/gms/internal/measurement/t4;
.end method

.method public abstract h([BIILcom/google/android/gms/internal/measurement/R4;)Lcom/google/android/gms/internal/measurement/t4;
.end method
