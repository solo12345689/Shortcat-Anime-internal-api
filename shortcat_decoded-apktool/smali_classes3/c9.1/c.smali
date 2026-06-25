.class public abstract Lc9/c;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# static fields
.field public static final a:LO8/c;

.field public static final b:LO8/c;

.field public static final c:LO8/c;

.field public static final d:LO8/c;

.field public static final e:LO8/c;

.field public static final f:LO8/c;

.field public static final g:LO8/c;

.field public static final h:LO8/c;

.field public static final i:LO8/c;

.field public static final j:LO8/c;

.field public static final k:LO8/c;

.field public static final l:[LO8/c;


# direct methods
.method static constructor <clinit>()V
    .locals 14

    .line 1
    new-instance v0, LO8/c;

    .line 2
    .line 3
    const-string v1, "auth_blockstore"

    .line 4
    .line 5
    const-wide/16 v2, 0x3

    .line 6
    .line 7
    invoke-direct {v0, v1, v2, v3}, LO8/c;-><init>(Ljava/lang/String;J)V

    .line 8
    .line 9
    .line 10
    sput-object v0, Lc9/c;->a:LO8/c;

    .line 11
    .line 12
    new-instance v1, LO8/c;

    .line 13
    .line 14
    const-string v4, "blockstore_data_transfer"

    .line 15
    .line 16
    const-wide/16 v5, 0x1

    .line 17
    .line 18
    invoke-direct {v1, v4, v5, v6}, LO8/c;-><init>(Ljava/lang/String;J)V

    .line 19
    .line 20
    .line 21
    sput-object v1, Lc9/c;->b:LO8/c;

    .line 22
    .line 23
    move-wide v3, v2

    .line 24
    new-instance v2, LO8/c;

    .line 25
    .line 26
    const-string v7, "blockstore_notify_app_restore"

    .line 27
    .line 28
    invoke-direct {v2, v7, v5, v6}, LO8/c;-><init>(Ljava/lang/String;J)V

    .line 29
    .line 30
    .line 31
    sput-object v2, Lc9/c;->c:LO8/c;

    .line 32
    .line 33
    move-wide v7, v3

    .line 34
    new-instance v3, LO8/c;

    .line 35
    .line 36
    const-string v4, "blockstore_store_bytes_with_options"

    .line 37
    .line 38
    const-wide/16 v9, 0x2

    .line 39
    .line 40
    invoke-direct {v3, v4, v9, v10}, LO8/c;-><init>(Ljava/lang/String;J)V

    .line 41
    .line 42
    .line 43
    sput-object v3, Lc9/c;->d:LO8/c;

    .line 44
    .line 45
    new-instance v4, LO8/c;

    .line 46
    .line 47
    const-string v11, "blockstore_is_end_to_end_encryption_available"

    .line 48
    .line 49
    invoke-direct {v4, v11, v5, v6}, LO8/c;-><init>(Ljava/lang/String;J)V

    .line 50
    .line 51
    .line 52
    sput-object v4, Lc9/c;->e:LO8/c;

    .line 53
    .line 54
    move-wide v11, v5

    .line 55
    new-instance v5, LO8/c;

    .line 56
    .line 57
    const-string v6, "blockstore_enable_cloud_backup"

    .line 58
    .line 59
    invoke-direct {v5, v6, v11, v12}, LO8/c;-><init>(Ljava/lang/String;J)V

    .line 60
    .line 61
    .line 62
    sput-object v5, Lc9/c;->f:LO8/c;

    .line 63
    .line 64
    new-instance v6, LO8/c;

    .line 65
    .line 66
    const-string v13, "blockstore_delete_bytes"

    .line 67
    .line 68
    invoke-direct {v6, v13, v9, v10}, LO8/c;-><init>(Ljava/lang/String;J)V

    .line 69
    .line 70
    .line 71
    sput-object v6, Lc9/c;->g:LO8/c;

    .line 72
    .line 73
    move-wide v8, v7

    .line 74
    new-instance v7, LO8/c;

    .line 75
    .line 76
    const-string v10, "blockstore_retrieve_bytes_with_options"

    .line 77
    .line 78
    invoke-direct {v7, v10, v8, v9}, LO8/c;-><init>(Ljava/lang/String;J)V

    .line 79
    .line 80
    .line 81
    sput-object v7, Lc9/c;->h:LO8/c;

    .line 82
    .line 83
    new-instance v8, LO8/c;

    .line 84
    .line 85
    const-string v9, "auth_clear_restore_credential"

    .line 86
    .line 87
    invoke-direct {v8, v9, v11, v12}, LO8/c;-><init>(Ljava/lang/String;J)V

    .line 88
    .line 89
    .line 90
    sput-object v8, Lc9/c;->i:LO8/c;

    .line 91
    .line 92
    new-instance v9, LO8/c;

    .line 93
    .line 94
    const-string v10, "auth_create_restore_credential"

    .line 95
    .line 96
    invoke-direct {v9, v10, v11, v12}, LO8/c;-><init>(Ljava/lang/String;J)V

    .line 97
    .line 98
    .line 99
    sput-object v9, Lc9/c;->j:LO8/c;

    .line 100
    .line 101
    new-instance v10, LO8/c;

    .line 102
    .line 103
    const-string v13, "auth_get_restore_credential"

    .line 104
    .line 105
    invoke-direct {v10, v13, v11, v12}, LO8/c;-><init>(Ljava/lang/String;J)V

    .line 106
    .line 107
    .line 108
    sput-object v10, Lc9/c;->k:LO8/c;

    .line 109
    .line 110
    filled-new-array/range {v0 .. v10}, [LO8/c;

    .line 111
    .line 112
    .line 113
    move-result-object v0

    .line 114
    sput-object v0, Lc9/c;->l:[LO8/c;

    .line 115
    .line 116
    return-void
.end method
