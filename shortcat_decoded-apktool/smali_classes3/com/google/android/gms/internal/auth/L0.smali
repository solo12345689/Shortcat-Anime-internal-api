.class final Lcom/google/android/gms/internal/auth/L0;
.super Lcom/google/android/gms/internal/auth/P0;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# static fields
.field private static final c:Ljava/lang/Class;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 2
    .line 3
    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    sput-object v0, Lcom/google/android/gms/internal/auth/L0;->c:Ljava/lang/Class;

    .line 12
    .line 13
    return-void
.end method

.method synthetic constructor <init>(Lcom/google/android/gms/internal/auth/K0;)V
    .locals 0

    .line 1
    const/4 p1, 0x0

    .line 2
    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/auth/P0;-><init>(Lcom/google/android/gms/internal/auth/O0;)V

    .line 3
    .line 4
    .line 5
    return-void
.end method


# virtual methods
.method final a(Ljava/lang/Object;J)V
    .locals 3

    .line 1
    invoke-static {p1, p2, p3}, Lcom/google/android/gms/internal/auth/A1;->f(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, Ljava/util/List;

    .line 6
    .line 7
    instance-of v1, v0, Lcom/google/android/gms/internal/auth/J0;

    .line 8
    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    check-cast v0, Lcom/google/android/gms/internal/auth/J0;

    .line 12
    .line 13
    invoke-interface {v0}, Lcom/google/android/gms/internal/auth/J0;->m()Lcom/google/android/gms/internal/auth/J0;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    goto :goto_0

    .line 18
    :cond_0
    sget-object v1, Lcom/google/android/gms/internal/auth/L0;->c:Ljava/lang/Class;

    .line 19
    .line 20
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    invoke-virtual {v1, v2}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    if-eqz v1, :cond_1

    .line 29
    .line 30
    return-void

    .line 31
    :cond_1
    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    :goto_0
    invoke-static {p1, p2, p3, v0}, Lcom/google/android/gms/internal/auth/A1;->p(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 36
    .line 37
    .line 38
    return-void
.end method

.method final b(Ljava/lang/Object;Ljava/lang/Object;J)V
    .locals 4

    .line 1
    invoke-static {p2, p3, p4}, Lcom/google/android/gms/internal/auth/A1;->f(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p2

    .line 5
    check-cast p2, Ljava/util/List;

    .line 6
    .line 7
    invoke-interface {p2}, Ljava/util/List;->size()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    invoke-static {p1, p3, p4}, Lcom/google/android/gms/internal/auth/A1;->f(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    check-cast v1, Ljava/util/List;

    .line 16
    .line 17
    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    .line 18
    .line 19
    .line 20
    move-result v2

    .line 21
    if-eqz v2, :cond_1

    .line 22
    .line 23
    instance-of v1, v1, Lcom/google/android/gms/internal/auth/J0;

    .line 24
    .line 25
    if-eqz v1, :cond_0

    .line 26
    .line 27
    new-instance v1, Lcom/google/android/gms/internal/auth/I0;

    .line 28
    .line 29
    invoke-direct {v1, v0}, Lcom/google/android/gms/internal/auth/I0;-><init>(I)V

    .line 30
    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_0
    new-instance v1, Ljava/util/ArrayList;

    .line 34
    .line 35
    invoke-direct {v1, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 36
    .line 37
    .line 38
    :goto_0
    invoke-static {p1, p3, p4, v1}, Lcom/google/android/gms/internal/auth/A1;->p(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    goto :goto_2

    .line 42
    :cond_1
    sget-object v2, Lcom/google/android/gms/internal/auth/L0;->c:Ljava/lang/Class;

    .line 43
    .line 44
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 45
    .line 46
    .line 47
    move-result-object v3

    .line 48
    invoke-virtual {v2, v3}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 49
    .line 50
    .line 51
    move-result v2

    .line 52
    if-eqz v2, :cond_2

    .line 53
    .line 54
    new-instance v2, Ljava/util/ArrayList;

    .line 55
    .line 56
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 57
    .line 58
    .line 59
    move-result v3

    .line 60
    add-int/2addr v3, v0

    .line 61
    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 62
    .line 63
    .line 64
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 65
    .line 66
    .line 67
    invoke-static {p1, p3, p4, v2}, Lcom/google/android/gms/internal/auth/A1;->p(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 68
    .line 69
    .line 70
    :goto_1
    move-object v1, v2

    .line 71
    goto :goto_2

    .line 72
    :cond_2
    instance-of v2, v1, Lcom/google/android/gms/internal/auth/v1;

    .line 73
    .line 74
    if-eqz v2, :cond_3

    .line 75
    .line 76
    new-instance v2, Lcom/google/android/gms/internal/auth/I0;

    .line 77
    .line 78
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 79
    .line 80
    .line 81
    move-result v3

    .line 82
    add-int/2addr v3, v0

    .line 83
    invoke-direct {v2, v3}, Lcom/google/android/gms/internal/auth/I0;-><init>(I)V

    .line 84
    .line 85
    .line 86
    check-cast v1, Lcom/google/android/gms/internal/auth/v1;

    .line 87
    .line 88
    invoke-virtual {v2}, Lcom/google/android/gms/internal/auth/I0;->size()I

    .line 89
    .line 90
    .line 91
    move-result v0

    .line 92
    invoke-virtual {v2, v0, v1}, Lcom/google/android/gms/internal/auth/c0;->addAll(ILjava/util/Collection;)Z

    .line 93
    .line 94
    .line 95
    invoke-static {p1, p3, p4, v2}, Lcom/google/android/gms/internal/auth/A1;->p(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 96
    .line 97
    .line 98
    goto :goto_1

    .line 99
    :cond_3
    :goto_2
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 100
    .line 101
    .line 102
    move-result v0

    .line 103
    invoke-interface {p2}, Ljava/util/List;->size()I

    .line 104
    .line 105
    .line 106
    move-result v2

    .line 107
    if-lez v0, :cond_4

    .line 108
    .line 109
    if-lez v2, :cond_4

    .line 110
    .line 111
    invoke-interface {v1, p2}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 112
    .line 113
    .line 114
    :cond_4
    if-gtz v0, :cond_5

    .line 115
    .line 116
    goto :goto_3

    .line 117
    :cond_5
    move-object p2, v1

    .line 118
    :goto_3
    invoke-static {p1, p3, p4, p2}, Lcom/google/android/gms/internal/auth/A1;->p(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 119
    .line 120
    .line 121
    return-void
.end method
