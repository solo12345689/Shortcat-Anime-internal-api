.class final Lcom/google/android/gms/internal/measurement/X;
.super Lcom/google/android/gms/internal/measurement/d0;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# instance fields
.field private a:Ljava/lang/String;

.field private b:B

.field private c:I

.field private d:I


# direct methods
.method constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/google/android/gms/internal/measurement/d0;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public final a(Z)Lcom/google/android/gms/internal/measurement/d0;
    .locals 0

    .line 1
    const/4 p1, 0x1

    .line 2
    iput-byte p1, p0, Lcom/google/android/gms/internal/measurement/X;->b:B

    .line 3
    .line 4
    return-object p0
.end method

.method public final b()Lcom/google/android/gms/internal/measurement/f0;
    .locals 9

    .line 1
    iget-byte v0, p0, Lcom/google/android/gms/internal/measurement/X;->b:B

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-ne v0, v1, :cond_1

    .line 5
    .line 6
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/X;->a:Ljava/lang/String;

    .line 7
    .line 8
    if-eqz v0, :cond_1

    .line 9
    .line 10
    iget v0, p0, Lcom/google/android/gms/internal/measurement/X;->c:I

    .line 11
    .line 12
    if-eqz v0, :cond_1

    .line 13
    .line 14
    iget v0, p0, Lcom/google/android/gms/internal/measurement/X;->d:I

    .line 15
    .line 16
    if-nez v0, :cond_0

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    new-instance v1, Lcom/google/android/gms/internal/measurement/Y;

    .line 20
    .line 21
    iget-object v2, p0, Lcom/google/android/gms/internal/measurement/X;->a:Ljava/lang/String;

    .line 22
    .line 23
    iget v4, p0, Lcom/google/android/gms/internal/measurement/X;->c:I

    .line 24
    .line 25
    iget v7, p0, Lcom/google/android/gms/internal/measurement/X;->d:I

    .line 26
    .line 27
    const/4 v8, 0x0

    .line 28
    const/4 v3, 0x0

    .line 29
    const/4 v5, 0x0

    .line 30
    const/4 v6, 0x0

    .line 31
    invoke-direct/range {v1 .. v8}, Lcom/google/android/gms/internal/measurement/Y;-><init>(Ljava/lang/String;ZILcom/google/android/gms/internal/measurement/V;Lcom/google/android/gms/internal/measurement/W;I[B)V

    .line 32
    .line 33
    .line 34
    return-object v1

    .line 35
    :cond_1
    :goto_0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 36
    .line 37
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 38
    .line 39
    .line 40
    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/X;->a:Ljava/lang/String;

    .line 41
    .line 42
    if-nez v1, :cond_2

    .line 43
    .line 44
    const-string v1, " fileOwner"

    .line 45
    .line 46
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 47
    .line 48
    .line 49
    :cond_2
    iget-byte v1, p0, Lcom/google/android/gms/internal/measurement/X;->b:B

    .line 50
    .line 51
    if-nez v1, :cond_3

    .line 52
    .line 53
    const-string v1, " hasDifferentDmaOwner"

    .line 54
    .line 55
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 56
    .line 57
    .line 58
    :cond_3
    iget v1, p0, Lcom/google/android/gms/internal/measurement/X;->c:I

    .line 59
    .line 60
    if-nez v1, :cond_4

    .line 61
    .line 62
    const-string v1, " fileChecks"

    .line 63
    .line 64
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 65
    .line 66
    .line 67
    :cond_4
    iget v1, p0, Lcom/google/android/gms/internal/measurement/X;->d:I

    .line 68
    .line 69
    if-nez v1, :cond_5

    .line 70
    .line 71
    const-string v1, " filePurpose"

    .line 72
    .line 73
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 74
    .line 75
    .line 76
    :cond_5
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 77
    .line 78
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object v0

    .line 82
    const-string v2, "Missing required properties:"

    .line 83
    .line 84
    invoke-virtual {v2, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 85
    .line 86
    .line 87
    move-result-object v0

    .line 88
    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 89
    .line 90
    .line 91
    throw v1
.end method

.method final c(I)Lcom/google/android/gms/internal/measurement/d0;
    .locals 0

    .line 1
    iput p1, p0, Lcom/google/android/gms/internal/measurement/X;->c:I

    .line 2
    .line 3
    return-object p0
.end method

.method public final d(I)Lcom/google/android/gms/internal/measurement/d0;
    .locals 0

    .line 1
    const/4 p1, 0x1

    .line 2
    iput p1, p0, Lcom/google/android/gms/internal/measurement/X;->d:I

    .line 3
    .line 4
    return-object p0
.end method

.method public final e(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/d0;
    .locals 0

    .line 1
    const-string p1, ""

    .line 2
    .line 3
    iput-object p1, p0, Lcom/google/android/gms/internal/measurement/X;->a:Ljava/lang/String;

    .line 4
    .line 5
    return-object p0
.end method
