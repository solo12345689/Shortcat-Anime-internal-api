.class public final Lcom/google/android/gms/internal/play_billing/O2;
.super Lcom/google/android/gms/internal/play_billing/J1;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lcom/google/android/gms/internal/play_billing/g2;


# static fields
.field private static final zzb:Lcom/google/android/gms/internal/play_billing/O2;


# instance fields
.field private zzd:I

.field private zze:I

.field private zzf:Ljava/lang/Object;

.field private zzg:I

.field private zzh:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lcom/google/android/gms/internal/play_billing/O2;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/google/android/gms/internal/play_billing/O2;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/google/android/gms/internal/play_billing/O2;->zzb:Lcom/google/android/gms/internal/play_billing/O2;

    .line 7
    .line 8
    const-class v1, Lcom/google/android/gms/internal/play_billing/O2;

    .line 9
    .line 10
    invoke-static {v1, v0}, Lcom/google/android/gms/internal/play_billing/J1;->z(Ljava/lang/Class;Lcom/google/android/gms/internal/play_billing/J1;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method private constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/google/android/gms/internal/play_billing/J1;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput v0, p0, Lcom/google/android/gms/internal/play_billing/O2;->zze:I

    .line 6
    .line 7
    return-void
.end method

.method static synthetic D(Lcom/google/android/gms/internal/play_billing/O2;Lcom/google/android/gms/internal/play_billing/Y2;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Lcom/google/android/gms/internal/play_billing/Y2;->zza()I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    iput p1, p0, Lcom/google/android/gms/internal/play_billing/O2;->zzh:I

    .line 6
    .line 7
    iget p1, p0, Lcom/google/android/gms/internal/play_billing/O2;->zzd:I

    .line 8
    .line 9
    or-int/lit8 p1, p1, 0x2

    .line 10
    .line 11
    iput p1, p0, Lcom/google/android/gms/internal/play_billing/O2;->zzd:I

    .line 12
    .line 13
    return-void
.end method

.method static synthetic E(Lcom/google/android/gms/internal/play_billing/O2;Lcom/google/android/gms/internal/play_billing/m3;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/google/android/gms/internal/play_billing/O2;->zzf:Ljava/lang/Object;

    .line 5
    .line 6
    const/4 p1, 0x2

    .line 7
    iput p1, p0, Lcom/google/android/gms/internal/play_billing/O2;->zze:I

    .line 8
    .line 9
    return-void
.end method

.method static synthetic F(Lcom/google/android/gms/internal/play_billing/O2;Lcom/google/android/gms/internal/play_billing/t3;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/google/android/gms/internal/play_billing/O2;->zzf:Ljava/lang/Object;

    .line 5
    .line 6
    const/4 p1, 0x4

    .line 7
    iput p1, p0, Lcom/google/android/gms/internal/play_billing/O2;->zze:I

    .line 8
    .line 9
    return-void
.end method

.method static synthetic G(Lcom/google/android/gms/internal/play_billing/O2;Lcom/google/android/gms/internal/play_billing/J3;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/google/android/gms/internal/play_billing/O2;->zzf:Ljava/lang/Object;

    .line 5
    .line 6
    const/4 p1, 0x3

    .line 7
    iput p1, p0, Lcom/google/android/gms/internal/play_billing/O2;->zze:I

    .line 8
    .line 9
    return-void
.end method

.method static synthetic H(Lcom/google/android/gms/internal/play_billing/O2;I)V
    .locals 0

    .line 1
    add-int/lit8 p1, p1, -0x1

    .line 2
    .line 3
    iput p1, p0, Lcom/google/android/gms/internal/play_billing/O2;->zzg:I

    .line 4
    .line 5
    iget p1, p0, Lcom/google/android/gms/internal/play_billing/O2;->zzd:I

    .line 6
    .line 7
    or-int/lit8 p1, p1, 0x1

    .line 8
    .line 9
    iput p1, p0, Lcom/google/android/gms/internal/play_billing/O2;->zzd:I

    .line 10
    .line 11
    return-void
.end method

.method public static I()Lcom/google/android/gms/internal/play_billing/L2;
    .locals 1

    .line 1
    sget-object v0, Lcom/google/android/gms/internal/play_billing/O2;->zzb:Lcom/google/android/gms/internal/play_billing/O2;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/google/android/gms/internal/play_billing/J1;->n()Lcom/google/android/gms/internal/play_billing/H1;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lcom/google/android/gms/internal/play_billing/L2;

    .line 8
    .line 9
    return-object v0
.end method

.method static bridge synthetic J()Lcom/google/android/gms/internal/play_billing/O2;
    .locals 1

    .line 1
    sget-object v0, Lcom/google/android/gms/internal/play_billing/O2;->zzb:Lcom/google/android/gms/internal/play_billing/O2;

    .line 2
    .line 3
    return-object v0
.end method


# virtual methods
.method public final C()Lcom/google/android/gms/internal/play_billing/t3;
    .locals 2

    .line 1
    iget v0, p0, Lcom/google/android/gms/internal/play_billing/O2;->zze:I

    .line 2
    .line 3
    const/4 v1, 0x4

    .line 4
    if-ne v0, v1, :cond_0

    .line 5
    .line 6
    iget-object v0, p0, Lcom/google/android/gms/internal/play_billing/O2;->zzf:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Lcom/google/android/gms/internal/play_billing/t3;

    .line 9
    .line 10
    return-object v0

    .line 11
    :cond_0
    invoke-static {}, Lcom/google/android/gms/internal/play_billing/t3;->E()Lcom/google/android/gms/internal/play_billing/t3;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    return-object v0
.end method

.method protected final i(ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

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
    sget-object p1, Lcom/google/android/gms/internal/play_billing/O2;->zzb:Lcom/google/android/gms/internal/play_billing/O2;

    .line 19
    .line 20
    return-object p1

    .line 21
    :cond_0
    throw p3

    .line 22
    :cond_1
    new-instance p1, Lcom/google/android/gms/internal/play_billing/L2;

    .line 23
    .line 24
    invoke-direct {p1, p3}, Lcom/google/android/gms/internal/play_billing/L2;-><init>(Lcom/google/android/gms/internal/play_billing/N2;)V

    .line 25
    .line 26
    .line 27
    return-object p1

    .line 28
    :cond_2
    new-instance p1, Lcom/google/android/gms/internal/play_billing/O2;

    .line 29
    .line 30
    invoke-direct {p1}, Lcom/google/android/gms/internal/play_billing/O2;-><init>()V

    .line 31
    .line 32
    .line 33
    return-object p1

    .line 34
    :cond_3
    sget-object v4, Lcom/google/android/gms/internal/play_billing/K2;->a:Lcom/google/android/gms/internal/play_billing/M1;

    .line 35
    .line 36
    const-string v8, "zzh"

    .line 37
    .line 38
    sget-object v9, Lcom/google/android/gms/internal/play_billing/X2;->a:Lcom/google/android/gms/internal/play_billing/M1;

    .line 39
    .line 40
    const-string v0, "zzf"

    .line 41
    .line 42
    const-string v1, "zze"

    .line 43
    .line 44
    const-string v2, "zzd"

    .line 45
    .line 46
    const-string v3, "zzg"

    .line 47
    .line 48
    const-class v5, Lcom/google/android/gms/internal/play_billing/m3;

    .line 49
    .line 50
    const-class v6, Lcom/google/android/gms/internal/play_billing/J3;

    .line 51
    .line 52
    const-class v7, Lcom/google/android/gms/internal/play_billing/t3;

    .line 53
    .line 54
    filled-new-array/range {v0 .. v9}, [Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    sget-object p2, Lcom/google/android/gms/internal/play_billing/O2;->zzb:Lcom/google/android/gms/internal/play_billing/O2;

    .line 59
    .line 60
    const-string p3, "\u0004\u0005\u0001\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001\u180c\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005\u180c\u0001"

    .line 61
    .line 62
    invoke-static {p2, p3, p1}, Lcom/google/android/gms/internal/play_billing/J1;->w(Lcom/google/android/gms/internal/play_billing/f2;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object p1

    .line 66
    return-object p1

    .line 67
    :cond_4
    const/4 p1, 0x1

    .line 68
    invoke-static {p1}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    .line 69
    .line 70
    .line 71
    move-result-object p1

    .line 72
    return-object p1
.end method
