.class public final enum Lcom/google/android/gms/measurement/internal/D3;
.super Ljava/lang/Enum;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# static fields
.field public static final enum b:Lcom/google/android/gms/measurement/internal/D3;

.field public static final enum c:Lcom/google/android/gms/measurement/internal/D3;

.field private static final synthetic d:[Lcom/google/android/gms/measurement/internal/D3;


# instance fields
.field private final a:[Lj9/v;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    new-instance v0, Lcom/google/android/gms/measurement/internal/D3;

    .line 2
    .line 3
    sget-object v1, Lj9/v;->b:Lj9/v;

    .line 4
    .line 5
    sget-object v2, Lj9/v;->c:Lj9/v;

    .line 6
    .line 7
    filled-new-array {v1, v2}, [Lj9/v;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    const-string v2, "STORAGE"

    .line 12
    .line 13
    const/4 v3, 0x0

    .line 14
    invoke-direct {v0, v2, v3, v1}, Lcom/google/android/gms/measurement/internal/D3;-><init>(Ljava/lang/String;I[Lj9/v;)V

    .line 15
    .line 16
    .line 17
    sput-object v0, Lcom/google/android/gms/measurement/internal/D3;->b:Lcom/google/android/gms/measurement/internal/D3;

    .line 18
    .line 19
    new-instance v1, Lcom/google/android/gms/measurement/internal/D3;

    .line 20
    .line 21
    sget-object v2, Lj9/v;->d:Lj9/v;

    .line 22
    .line 23
    filled-new-array {v2}, [Lj9/v;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    const-string v3, "DMA"

    .line 28
    .line 29
    const/4 v4, 0x1

    .line 30
    invoke-direct {v1, v3, v4, v2}, Lcom/google/android/gms/measurement/internal/D3;-><init>(Ljava/lang/String;I[Lj9/v;)V

    .line 31
    .line 32
    .line 33
    sput-object v1, Lcom/google/android/gms/measurement/internal/D3;->c:Lcom/google/android/gms/measurement/internal/D3;

    .line 34
    .line 35
    filled-new-array {v0, v1}, [Lcom/google/android/gms/measurement/internal/D3;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    sput-object v0, Lcom/google/android/gms/measurement/internal/D3;->d:[Lcom/google/android/gms/measurement/internal/D3;

    .line 40
    .line 41
    return-void
.end method

.method private varargs constructor <init>(Ljava/lang/String;I[Lj9/v;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    .line 3
    .line 4
    iput-object p3, p0, Lcom/google/android/gms/measurement/internal/D3;->a:[Lj9/v;

    .line 5
    .line 6
    return-void
.end method

.method public static values()[Lcom/google/android/gms/measurement/internal/D3;
    .locals 1

    .line 1
    sget-object v0, Lcom/google/android/gms/measurement/internal/D3;->d:[Lcom/google/android/gms/measurement/internal/D3;

    .line 2
    .line 3
    invoke-virtual {v0}, [Lcom/google/android/gms/measurement/internal/D3;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [Lcom/google/android/gms/measurement/internal/D3;

    .line 8
    .line 9
    return-object v0
.end method


# virtual methods
.method public final a()[Lj9/v;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/D3;->a:[Lj9/v;

    .line 2
    .line 3
    return-object v0
.end method

.method final synthetic b()[Lj9/v;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/D3;->a:[Lj9/v;

    .line 2
    .line 3
    return-object v0
.end method
