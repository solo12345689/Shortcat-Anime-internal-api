.class final synthetic Lcom/google/android/gms/measurement/internal/z4;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private final synthetic a:Lcom/google/android/gms/measurement/internal/A4;

.field private final synthetic b:I

.field private final synthetic c:Ljava/lang/Exception;

.field private final synthetic d:[B

.field private final synthetic e:Ljava/util/Map;


# direct methods
.method synthetic constructor <init>(Lcom/google/android/gms/measurement/internal/A4;ILjava/lang/Exception;[BLjava/util/Map;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/google/android/gms/measurement/internal/z4;->a:Lcom/google/android/gms/measurement/internal/A4;

    .line 5
    .line 6
    iput p2, p0, Lcom/google/android/gms/measurement/internal/z4;->b:I

    .line 7
    .line 8
    iput-object p3, p0, Lcom/google/android/gms/measurement/internal/z4;->c:Ljava/lang/Exception;

    .line 9
    .line 10
    iput-object p4, p0, Lcom/google/android/gms/measurement/internal/z4;->d:[B

    .line 11
    .line 12
    iput-object p5, p0, Lcom/google/android/gms/measurement/internal/z4;->e:Ljava/util/Map;

    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final synthetic run()V
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/z4;->a:Lcom/google/android/gms/measurement/internal/A4;

    .line 2
    .line 3
    iget v1, p0, Lcom/google/android/gms/measurement/internal/z4;->b:I

    .line 4
    .line 5
    iget-object v2, p0, Lcom/google/android/gms/measurement/internal/z4;->c:Ljava/lang/Exception;

    .line 6
    .line 7
    iget-object v3, p0, Lcom/google/android/gms/measurement/internal/z4;->d:[B

    .line 8
    .line 9
    iget-object v4, p0, Lcom/google/android/gms/measurement/internal/z4;->e:Ljava/util/Map;

    .line 10
    .line 11
    invoke-virtual {v0, v1, v2, v3, v4}, Lcom/google/android/gms/measurement/internal/A4;->a(ILjava/lang/Exception;[BLjava/util/Map;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method
