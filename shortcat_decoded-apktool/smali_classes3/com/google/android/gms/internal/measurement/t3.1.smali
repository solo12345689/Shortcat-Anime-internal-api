.class public final Lcom/google/android/gms/internal/measurement/t3;
.super Lcom/google/android/gms/internal/measurement/d5;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lcom/google/android/gms/internal/measurement/F5;


# static fields
.field private static final zzg:Lcom/google/android/gms/internal/measurement/t3;


# instance fields
.field private zzb:I

.field private zzd:I

.field private zze:I

.field private zzf:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lcom/google/android/gms/internal/measurement/t3;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/google/android/gms/internal/measurement/t3;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/google/android/gms/internal/measurement/t3;->zzg:Lcom/google/android/gms/internal/measurement/t3;

    .line 7
    .line 8
    const-class v1, Lcom/google/android/gms/internal/measurement/t3;

    .line 9
    .line 10
    invoke-static {v1, v0}, Lcom/google/android/gms/internal/measurement/d5;->s(Ljava/lang/Class;Lcom/google/android/gms/internal/measurement/d5;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/google/android/gms/internal/measurement/d5;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static D()Lcom/google/android/gms/internal/measurement/m3;
    .locals 1

    .line 1
    sget-object v0, Lcom/google/android/gms/internal/measurement/t3;->zzg:Lcom/google/android/gms/internal/measurement/t3;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/d5;->o()Lcom/google/android/gms/internal/measurement/b5;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lcom/google/android/gms/internal/measurement/m3;

    .line 8
    .line 9
    return-object v0
.end method

.method public static E()Lcom/google/android/gms/internal/measurement/t3;
    .locals 1

    .line 1
    sget-object v0, Lcom/google/android/gms/internal/measurement/t3;->zzg:Lcom/google/android/gms/internal/measurement/t3;

    .line 2
    .line 3
    return-object v0
.end method

.method static synthetic G()Lcom/google/android/gms/internal/measurement/t3;
    .locals 1

    .line 1
    sget-object v0, Lcom/google/android/gms/internal/measurement/t3;->zzg:Lcom/google/android/gms/internal/measurement/t3;

    .line 2
    .line 3
    return-object v0
.end method


# virtual methods
.method protected final B(ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    add-int/lit8 p1, p1, -0x1

    .line 2
    .line 3
    if-eqz p1, :cond_4

    .line 4
    .line 5
    const/4 p2, 0x2

    .line 6
    if-eq p1, p2, :cond_3

    .line 7
    .line 8
    const/4 p2, 0x3

    .line 9
    if-eq p1, p2, :cond_2

    .line 10
    .line 11
    const/4 p2, 0x4

    .line 12
    const/4 p3, 0x0

    .line 13
    if-eq p1, p2, :cond_1

    .line 14
    .line 15
    const/4 p2, 0x5

    .line 16
    if-ne p1, p2, :cond_0

    .line 17
    .line 18
    sget-object p1, Lcom/google/android/gms/internal/measurement/t3;->zzg:Lcom/google/android/gms/internal/measurement/t3;

    .line 19
    .line 20
    return-object p1

    .line 21
    :cond_0
    throw p3

    .line 22
    :cond_1
    new-instance p1, Lcom/google/android/gms/internal/measurement/m3;

    .line 23
    .line 24
    invoke-direct {p1, p3}, Lcom/google/android/gms/internal/measurement/m3;-><init>([B)V

    .line 25
    .line 26
    .line 27
    return-object p1

    .line 28
    :cond_2
    new-instance p1, Lcom/google/android/gms/internal/measurement/t3;

    .line 29
    .line 30
    invoke-direct {p1}, Lcom/google/android/gms/internal/measurement/t3;-><init>()V

    .line 31
    .line 32
    .line 33
    return-object p1

    .line 34
    :cond_3
    sget-object v2, Lcom/google/android/gms/internal/measurement/r3;->a:Lcom/google/android/gms/internal/measurement/g5;

    .line 35
    .line 36
    sget-object v4, Lcom/google/android/gms/internal/measurement/n3;->a:Lcom/google/android/gms/internal/measurement/g5;

    .line 37
    .line 38
    const-string v5, "zzf"

    .line 39
    .line 40
    sget-object v6, Lcom/google/android/gms/internal/measurement/p3;->a:Lcom/google/android/gms/internal/measurement/g5;

    .line 41
    .line 42
    const-string v0, "zzb"

    .line 43
    .line 44
    const-string v1, "zzd"

    .line 45
    .line 46
    const-string v3, "zze"

    .line 47
    .line 48
    filled-new-array/range {v0 .. v6}, [Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    sget-object p2, Lcom/google/android/gms/internal/measurement/t3;->zzg:Lcom/google/android/gms/internal/measurement/t3;

    .line 53
    .line 54
    const-string p3, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u180c\u0000\u0002\u180c\u0001\u0003\u180c\u0002"

    .line 55
    .line 56
    invoke-static {p2, p3, p1}, Lcom/google/android/gms/internal/measurement/d5;->t(Lcom/google/android/gms/internal/measurement/E5;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    return-object p1

    .line 61
    :cond_4
    const/4 p1, 0x1

    .line 62
    invoke-static {p1}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    .line 63
    .line 64
    .line 65
    move-result-object p1

    .line 66
    return-object p1
.end method

.method public final C()Lcom/google/android/gms/internal/measurement/o3;
    .locals 1

    .line 1
    iget v0, p0, Lcom/google/android/gms/internal/measurement/t3;->zze:I

    .line 2
    .line 3
    invoke-static {v0}, Lcom/google/android/gms/internal/measurement/o3;->a(I)Lcom/google/android/gms/internal/measurement/o3;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    sget-object v0, Lcom/google/android/gms/internal/measurement/o3;->b:Lcom/google/android/gms/internal/measurement/o3;

    .line 10
    .line 11
    :cond_0
    return-object v0
.end method

.method final synthetic F(Lcom/google/android/gms/internal/measurement/o3;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/o3;->zza()I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    iput p1, p0, Lcom/google/android/gms/internal/measurement/t3;->zze:I

    .line 6
    .line 7
    iget p1, p0, Lcom/google/android/gms/internal/measurement/t3;->zzb:I

    .line 8
    .line 9
    or-int/lit8 p1, p1, 0x2

    .line 10
    .line 11
    iput p1, p0, Lcom/google/android/gms/internal/measurement/t3;->zzb:I

    .line 12
    .line 13
    return-void
.end method

.method public final H()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/google/android/gms/internal/measurement/t3;->zzd:I

    .line 2
    .line 3
    invoke-static {v0}, Lcom/google/android/gms/internal/measurement/s3;->a(I)I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    const/4 v0, 0x1

    .line 10
    :cond_0
    return v0
.end method

.method public final I()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/google/android/gms/internal/measurement/t3;->zzf:I

    .line 2
    .line 3
    invoke-static {v0}, Lcom/google/android/gms/internal/measurement/q3;->a(I)I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    const/4 v0, 0x1

    .line 10
    :cond_0
    return v0
.end method

.method final synthetic J(I)V
    .locals 0

    .line 1
    add-int/lit8 p1, p1, -0x1

    .line 2
    .line 3
    iput p1, p0, Lcom/google/android/gms/internal/measurement/t3;->zzd:I

    .line 4
    .line 5
    iget p1, p0, Lcom/google/android/gms/internal/measurement/t3;->zzb:I

    .line 6
    .line 7
    or-int/lit8 p1, p1, 0x1

    .line 8
    .line 9
    iput p1, p0, Lcom/google/android/gms/internal/measurement/t3;->zzb:I

    .line 10
    .line 11
    return-void
.end method

.method final synthetic K(I)V
    .locals 0

    .line 1
    add-int/lit8 p1, p1, -0x1

    .line 2
    .line 3
    iput p1, p0, Lcom/google/android/gms/internal/measurement/t3;->zzf:I

    .line 4
    .line 5
    iget p1, p0, Lcom/google/android/gms/internal/measurement/t3;->zzb:I

    .line 6
    .line 7
    or-int/lit8 p1, p1, 0x4

    .line 8
    .line 9
    iput p1, p0, Lcom/google/android/gms/internal/measurement/t3;->zzb:I

    .line 10
    .line 11
    return-void
.end method
