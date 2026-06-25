.class public final Lcom/google/android/gms/internal/measurement/y;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# instance fields
.field final a:Ljava/util/Map;

.field final b:Lcom/google/android/gms/internal/measurement/L;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/HashMap;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lcom/google/android/gms/internal/measurement/y;->a:Ljava/util/Map;

    .line 10
    .line 11
    new-instance v0, Lcom/google/android/gms/internal/measurement/L;

    .line 12
    .line 13
    invoke-direct {v0}, Lcom/google/android/gms/internal/measurement/L;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, Lcom/google/android/gms/internal/measurement/y;->b:Lcom/google/android/gms/internal/measurement/L;

    .line 17
    .line 18
    new-instance v0, Lcom/google/android/gms/internal/measurement/w;

    .line 19
    .line 20
    invoke-direct {v0}, Lcom/google/android/gms/internal/measurement/w;-><init>()V

    .line 21
    .line 22
    .line 23
    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/measurement/y;->a(Lcom/google/android/gms/internal/measurement/x;)V

    .line 24
    .line 25
    .line 26
    new-instance v0, Lcom/google/android/gms/internal/measurement/z;

    .line 27
    .line 28
    invoke-direct {v0}, Lcom/google/android/gms/internal/measurement/z;-><init>()V

    .line 29
    .line 30
    .line 31
    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/measurement/y;->a(Lcom/google/android/gms/internal/measurement/x;)V

    .line 32
    .line 33
    .line 34
    new-instance v0, Lcom/google/android/gms/internal/measurement/A;

    .line 35
    .line 36
    invoke-direct {v0}, Lcom/google/android/gms/internal/measurement/A;-><init>()V

    .line 37
    .line 38
    .line 39
    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/measurement/y;->a(Lcom/google/android/gms/internal/measurement/x;)V

    .line 40
    .line 41
    .line 42
    new-instance v0, Lcom/google/android/gms/internal/measurement/E;

    .line 43
    .line 44
    invoke-direct {v0}, Lcom/google/android/gms/internal/measurement/E;-><init>()V

    .line 45
    .line 46
    .line 47
    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/measurement/y;->a(Lcom/google/android/gms/internal/measurement/x;)V

    .line 48
    .line 49
    .line 50
    new-instance v0, Lcom/google/android/gms/internal/measurement/J;

    .line 51
    .line 52
    invoke-direct {v0}, Lcom/google/android/gms/internal/measurement/J;-><init>()V

    .line 53
    .line 54
    .line 55
    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/measurement/y;->a(Lcom/google/android/gms/internal/measurement/x;)V

    .line 56
    .line 57
    .line 58
    new-instance v0, Lcom/google/android/gms/internal/measurement/K;

    .line 59
    .line 60
    invoke-direct {v0}, Lcom/google/android/gms/internal/measurement/K;-><init>()V

    .line 61
    .line 62
    .line 63
    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/measurement/y;->a(Lcom/google/android/gms/internal/measurement/x;)V

    .line 64
    .line 65
    .line 66
    new-instance v0, Lcom/google/android/gms/internal/measurement/M;

    .line 67
    .line 68
    invoke-direct {v0}, Lcom/google/android/gms/internal/measurement/M;-><init>()V

    .line 69
    .line 70
    .line 71
    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/measurement/y;->a(Lcom/google/android/gms/internal/measurement/x;)V

    .line 72
    .line 73
    .line 74
    return-void
.end method


# virtual methods
.method final a(Lcom/google/android/gms/internal/measurement/x;)V
    .locals 3

    .line 1
    iget-object v0, p1, Lcom/google/android/gms/internal/measurement/x;->a:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    check-cast v1, Lcom/google/android/gms/internal/measurement/N;

    .line 18
    .line 19
    invoke-virtual {v1}, Lcom/google/android/gms/internal/measurement/N;->b()Ljava/lang/Integer;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    invoke-virtual {v1}, Ljava/lang/Integer;->toString()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    iget-object v2, p0, Lcom/google/android/gms/internal/measurement/y;->a:Ljava/util/Map;

    .line 28
    .line 29
    invoke-interface {v2, v1, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_0
    return-void
.end method

.method public final b(Lcom/google/android/gms/internal/measurement/Y1;Lcom/google/android/gms/internal/measurement/q;)Lcom/google/android/gms/internal/measurement/q;
    .locals 3

    .line 1
    invoke-static {p1}, Lcom/google/android/gms/internal/measurement/z2;->l(Lcom/google/android/gms/internal/measurement/Y1;)I

    .line 2
    .line 3
    .line 4
    instance-of v0, p2, Lcom/google/android/gms/internal/measurement/r;

    .line 5
    .line 6
    if-eqz v0, :cond_1

    .line 7
    .line 8
    check-cast p2, Lcom/google/android/gms/internal/measurement/r;

    .line 9
    .line 10
    invoke-virtual {p2}, Lcom/google/android/gms/internal/measurement/r;->b()Ljava/util/ArrayList;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-virtual {p2}, Lcom/google/android/gms/internal/measurement/r;->a()Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object p2

    .line 18
    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/y;->a:Ljava/util/Map;

    .line 19
    .line 20
    invoke-interface {v1, p2}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 21
    .line 22
    .line 23
    move-result v2

    .line 24
    if-eqz v2, :cond_0

    .line 25
    .line 26
    invoke-interface {v1, p2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    check-cast v1, Lcom/google/android/gms/internal/measurement/x;

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_0
    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/y;->b:Lcom/google/android/gms/internal/measurement/L;

    .line 34
    .line 35
    :goto_0
    invoke-virtual {v1, p2, p1, v0}, Lcom/google/android/gms/internal/measurement/x;->a(Ljava/lang/String;Lcom/google/android/gms/internal/measurement/Y1;Ljava/util/List;)Lcom/google/android/gms/internal/measurement/q;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    return-object p1

    .line 40
    :cond_1
    return-object p2
.end method
