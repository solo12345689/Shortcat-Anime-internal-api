.class public final Lcom/google/android/gms/internal/measurement/D6;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lcom/google/android/gms/internal/measurement/C6;


# static fields
.field public static final a:Lcom/google/android/gms/internal/measurement/o4;

.field public static final b:Lcom/google/android/gms/internal/measurement/o4;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .line 1
    new-instance v0, Lcom/google/android/gms/internal/measurement/i4;

    .line 2
    .line 3
    const-string v1, "com.google.android.gms.measurement"

    .line 4
    .line 5
    invoke-static {v1}, Lcom/google/android/gms/internal/measurement/d4;->a(Ljava/lang/String;)Landroid/net/Uri;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/measurement/i4;-><init>(Landroid/net/Uri;)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/i4;->a()Lcom/google/android/gms/internal/measurement/i4;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/i4;->b()Lcom/google/android/gms/internal/measurement/i4;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    const-string v1, "measurement.set_default_event_parameters_with_backfill.client.dev"

    .line 21
    .line 22
    const/4 v2, 0x0

    .line 23
    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/measurement/i4;->d(Ljava/lang/String;Z)Lcom/google/android/gms/internal/measurement/o4;

    .line 24
    .line 25
    .line 26
    const-string v1, "measurement.set_default_event_parameters_with_backfill.service"

    .line 27
    .line 28
    const/4 v3, 0x1

    .line 29
    invoke-virtual {v0, v1, v3}, Lcom/google/android/gms/internal/measurement/i4;->d(Ljava/lang/String;Z)Lcom/google/android/gms/internal/measurement/o4;

    .line 30
    .line 31
    .line 32
    const-string v1, "measurement.id.set_default_event_parameters.fix_service_request_ordering"

    .line 33
    .line 34
    const-wide/16 v4, 0x0

    .line 35
    .line 36
    invoke-virtual {v0, v1, v4, v5}, Lcom/google/android/gms/internal/measurement/i4;->c(Ljava/lang/String;J)Lcom/google/android/gms/internal/measurement/o4;

    .line 37
    .line 38
    .line 39
    const-string v1, "measurement.set_default_event_parameters.fix_app_update_logging"

    .line 40
    .line 41
    invoke-virtual {v0, v1, v3}, Lcom/google/android/gms/internal/measurement/i4;->d(Ljava/lang/String;Z)Lcom/google/android/gms/internal/measurement/o4;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    sput-object v1, Lcom/google/android/gms/internal/measurement/D6;->a:Lcom/google/android/gms/internal/measurement/o4;

    .line 46
    .line 47
    const-string v1, "measurement.set_default_event_parameters.fix_service_request_ordering"

    .line 48
    .line 49
    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/measurement/i4;->d(Ljava/lang/String;Z)Lcom/google/android/gms/internal/measurement/o4;

    .line 50
    .line 51
    .line 52
    move-result-object v1

    .line 53
    sput-object v1, Lcom/google/android/gms/internal/measurement/D6;->b:Lcom/google/android/gms/internal/measurement/o4;

    .line 54
    .line 55
    const-string v1, "measurement.set_default_event_parameters.fix_subsequent_launches"

    .line 56
    .line 57
    invoke-virtual {v0, v1, v3}, Lcom/google/android/gms/internal/measurement/i4;->d(Ljava/lang/String;Z)Lcom/google/android/gms/internal/measurement/o4;

    .line 58
    .line 59
    .line 60
    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public final j()Z
    .locals 1

    .line 1
    sget-object v0, Lcom/google/android/gms/internal/measurement/D6;->b:Lcom/google/android/gms/internal/measurement/o4;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/o4;->d()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Ljava/lang/Boolean;

    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    return v0
.end method

.method public final zza()Z
    .locals 1

    .line 1
    sget-object v0, Lcom/google/android/gms/internal/measurement/D6;->a:Lcom/google/android/gms/internal/measurement/o4;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/o4;->d()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Ljava/lang/Boolean;

    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    return v0
.end method
