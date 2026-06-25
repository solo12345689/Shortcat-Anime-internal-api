.class public abstract LF3/g;
.super Landroid/app/Service;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LF3/g$n;,
        LF3/g$f;,
        LF3/g$o;,
        LF3/g$q;,
        LF3/g$k;,
        LF3/g$g;,
        LF3/g$j;,
        LF3/g$i;,
        LF3/g$h;,
        LF3/g$l;,
        LF3/g$p;,
        LF3/g$e;,
        LF3/g$m;
    }
.end annotation


# static fields
.field static final i:Z


# instance fields
.field private a:LF3/g$g;

.field private final b:LF3/g$n;

.field final c:LF3/g$f;

.field final d:Ljava/util/ArrayList;

.field final e:Lt/a;

.field f:LF3/g$f;

.field final g:LF3/g$q;

.field h:LF3/n$j;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    const-string v0, "MBServiceCompat"

    .line 2
    .line 3
    const/4 v1, 0x3

    .line 4
    invoke-static {v0, v1}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    sput-boolean v0, LF3/g;->i:Z

    .line 9
    .line 10
    return-void
.end method

.method public constructor <init>()V
    .locals 8

    .line 1
    invoke-direct {p0}, Landroid/app/Service;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, LF3/g$n;

    .line 5
    .line 6
    invoke-direct {v0, p0}, LF3/g$n;-><init>(LF3/g;)V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, LF3/g;->b:LF3/g$n;

    .line 10
    .line 11
    new-instance v1, LF3/g$f;

    .line 12
    .line 13
    const/4 v6, 0x0

    .line 14
    const/4 v7, 0x0

    .line 15
    const-string v3, "android.media.session.MediaController"

    .line 16
    .line 17
    const/4 v4, -0x1

    .line 18
    const/4 v5, -0x1

    .line 19
    move-object v2, p0

    .line 20
    invoke-direct/range {v1 .. v7}, LF3/g$f;-><init>(LF3/g;Ljava/lang/String;IILandroid/os/Bundle;LF3/g$o;)V

    .line 21
    .line 22
    .line 23
    iput-object v1, v2, LF3/g;->c:LF3/g$f;

    .line 24
    .line 25
    new-instance v0, Ljava/util/ArrayList;

    .line 26
    .line 27
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 28
    .line 29
    .line 30
    iput-object v0, v2, LF3/g;->d:Ljava/util/ArrayList;

    .line 31
    .line 32
    new-instance v0, Lt/a;

    .line 33
    .line 34
    invoke-direct {v0}, Lt/a;-><init>()V

    .line 35
    .line 36
    .line 37
    iput-object v0, v2, LF3/g;->e:Lt/a;

    .line 38
    .line 39
    new-instance v0, LF3/g$q;

    .line 40
    .line 41
    invoke-direct {v0, p0}, LF3/g$q;-><init>(LF3/g;)V

    .line 42
    .line 43
    .line 44
    iput-object v0, v2, LF3/g;->g:LF3/g$q;

    .line 45
    .line 46
    return-void
.end method


# virtual methods
.method a(Ljava/lang/String;LF3/g$f;Landroid/os/IBinder;Landroid/os/Bundle;)V
    .locals 4

    .line 1
    iget-object v0, p2, LF3/g$f;->g:Ljava/util/HashMap;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Ljava/util/List;

    .line 8
    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    new-instance v0, Ljava/util/ArrayList;

    .line 12
    .line 13
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 14
    .line 15
    .line 16
    :cond_0
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    :cond_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 21
    .line 22
    .line 23
    move-result v2

    .line 24
    if-eqz v2, :cond_2

    .line 25
    .line 26
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v2

    .line 30
    check-cast v2, LK1/c;

    .line 31
    .line 32
    iget-object v3, v2, LK1/c;->a:Ljava/lang/Object;

    .line 33
    .line 34
    if-ne p3, v3, :cond_1

    .line 35
    .line 36
    iget-object v2, v2, LK1/c;->b:Ljava/lang/Object;

    .line 37
    .line 38
    check-cast v2, Landroid/os/Bundle;

    .line 39
    .line 40
    invoke-static {p4, v2}, LF3/f;->a(Landroid/os/Bundle;Landroid/os/Bundle;)Z

    .line 41
    .line 42
    .line 43
    move-result v2

    .line 44
    if-eqz v2, :cond_1

    .line 45
    .line 46
    return-void

    .line 47
    :cond_2
    new-instance v1, LK1/c;

    .line 48
    .line 49
    invoke-direct {v1, p3, p4}, LK1/c;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 53
    .line 54
    .line 55
    iget-object p3, p2, LF3/g$f;->g:Ljava/util/HashMap;

    .line 56
    .line 57
    invoke-virtual {p3, p1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    const/4 p3, 0x0

    .line 61
    invoke-virtual {p0, p1, p2, p4, p3}, LF3/g;->o(Ljava/lang/String;LF3/g$f;Landroid/os/Bundle;Landroid/os/Bundle;)V

    .line 62
    .line 63
    .line 64
    iput-object p2, p0, LF3/g;->f:LF3/g$f;

    .line 65
    .line 66
    invoke-virtual {p0, p1, p4}, LF3/g;->l(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 67
    .line 68
    .line 69
    iput-object p3, p0, LF3/g;->f:LF3/g$f;

    .line 70
    .line 71
    return-void
.end method

.method b(Ljava/util/List;Landroid/os/Bundle;)Ljava/util/List;
    .locals 3

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    const/4 p1, 0x0

    .line 4
    return-object p1

    .line 5
    :cond_0
    if-nez p2, :cond_1

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_1
    const-string v0, "android.media.browse.extra.PAGE"

    .line 9
    .line 10
    const/4 v1, -0x1

    .line 11
    invoke-virtual {p2, v0, v1}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    const-string v2, "android.media.browse.extra.PAGE_SIZE"

    .line 16
    .line 17
    invoke-virtual {p2, v2, v1}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    .line 18
    .line 19
    .line 20
    move-result p2

    .line 21
    if-ne v0, v1, :cond_2

    .line 22
    .line 23
    if-ne p2, v1, :cond_2

    .line 24
    .line 25
    :goto_0
    return-object p1

    .line 26
    :cond_2
    mul-int v1, p2, v0

    .line 27
    .line 28
    add-int v2, v1, p2

    .line 29
    .line 30
    if-ltz v0, :cond_5

    .line 31
    .line 32
    const/4 v0, 0x1

    .line 33
    if-lt p2, v0, :cond_5

    .line 34
    .line 35
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 36
    .line 37
    .line 38
    move-result p2

    .line 39
    if-lt v1, p2, :cond_3

    .line 40
    .line 41
    goto :goto_1

    .line 42
    :cond_3
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 43
    .line 44
    .line 45
    move-result p2

    .line 46
    if-le v2, p2, :cond_4

    .line 47
    .line 48
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 49
    .line 50
    .line 51
    move-result v2

    .line 52
    :cond_4
    invoke-interface {p1, v1, v2}, Ljava/util/List;->subList(II)Ljava/util/List;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    return-object p1

    .line 57
    :cond_5
    :goto_1
    sget-object p1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 58
    .line 59
    return-object p1
.end method

.method public c(Landroid/content/Context;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Landroid/content/ContextWrapper;->attachBaseContext(Landroid/content/Context;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public final d()LF3/q$b;
    .locals 1

    .line 1
    iget-object v0, p0, LF3/g;->a:LF3/g$g;

    .line 2
    .line 3
    invoke-static {v0}, Lt2/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, LF3/g$g;

    .line 8
    .line 9
    invoke-interface {v0}, LF3/g$g;->b()LF3/q$b;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    return-object v0
.end method

.method public dump(Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V
    .locals 0

    .line 1
    return-void
.end method

.method e(Landroid/os/Message;)V
    .locals 8

    .line 1
    invoke-virtual {p1}, Landroid/os/Message;->getData()Landroid/os/Bundle;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget v1, p1, Landroid/os/Message;->what:I

    .line 6
    .line 7
    const-string v2, "data_callback_token"

    .line 8
    .line 9
    const-string v3, "data_media_item_id"

    .line 10
    .line 11
    const-string v4, "data_result_receiver"

    .line 12
    .line 13
    packed-switch v1, :pswitch_data_0

    .line 14
    .line 15
    .line 16
    new-instance v0, Ljava/lang/StringBuilder;

    .line 17
    .line 18
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 19
    .line 20
    .line 21
    const-string v1, "Unhandled message: "

    .line 22
    .line 23
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    const-string v1, "\n  Service version: "

    .line 30
    .line 31
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    const/4 v1, 0x2

    .line 35
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    const-string v1, "\n  Client version: "

    .line 39
    .line 40
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    iget p1, p1, Landroid/os/Message;->arg1:I

    .line 44
    .line 45
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    const-string v0, "MBServiceCompat"

    .line 53
    .line 54
    invoke-static {v0, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 55
    .line 56
    .line 57
    return-void

    .line 58
    :pswitch_0
    const-string v1, "data_custom_action_extras"

    .line 59
    .line 60
    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    .line 61
    .line 62
    .line 63
    move-result-object v1

    .line 64
    invoke-static {v1}, LF3/n;->a(Landroid/os/Bundle;)V

    .line 65
    .line 66
    .line 67
    iget-object v2, p0, LF3/g;->b:LF3/g$n;

    .line 68
    .line 69
    const-string v3, "data_custom_action"

    .line 70
    .line 71
    invoke-virtual {v0, v3}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object v3

    .line 75
    invoke-virtual {v0, v4}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 76
    .line 77
    .line 78
    move-result-object v0

    .line 79
    check-cast v0, Ld/b;

    .line 80
    .line 81
    new-instance v4, LF3/g$p;

    .line 82
    .line 83
    iget-object p1, p1, Landroid/os/Message;->replyTo:Landroid/os/Messenger;

    .line 84
    .line 85
    invoke-direct {v4, p1}, LF3/g$p;-><init>(Landroid/os/Messenger;)V

    .line 86
    .line 87
    .line 88
    invoke-virtual {v2, v3, v1, v0, v4}, LF3/g$n;->f(Ljava/lang/String;Landroid/os/Bundle;Ld/b;LF3/g$o;)V

    .line 89
    .line 90
    .line 91
    return-void

    .line 92
    :pswitch_1
    const-string v1, "data_search_extras"

    .line 93
    .line 94
    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    .line 95
    .line 96
    .line 97
    move-result-object v1

    .line 98
    invoke-static {v1}, LF3/n;->a(Landroid/os/Bundle;)V

    .line 99
    .line 100
    .line 101
    iget-object v2, p0, LF3/g;->b:LF3/g$n;

    .line 102
    .line 103
    const-string v3, "data_search_query"

    .line 104
    .line 105
    invoke-virtual {v0, v3}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 106
    .line 107
    .line 108
    move-result-object v3

    .line 109
    invoke-virtual {v0, v4}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 110
    .line 111
    .line 112
    move-result-object v0

    .line 113
    check-cast v0, Ld/b;

    .line 114
    .line 115
    new-instance v4, LF3/g$p;

    .line 116
    .line 117
    iget-object p1, p1, Landroid/os/Message;->replyTo:Landroid/os/Messenger;

    .line 118
    .line 119
    invoke-direct {v4, p1}, LF3/g$p;-><init>(Landroid/os/Messenger;)V

    .line 120
    .line 121
    .line 122
    invoke-virtual {v2, v3, v1, v0, v4}, LF3/g$n;->e(Ljava/lang/String;Landroid/os/Bundle;Ld/b;LF3/g$o;)V

    .line 123
    .line 124
    .line 125
    return-void

    .line 126
    :pswitch_2
    iget-object v0, p0, LF3/g;->b:LF3/g$n;

    .line 127
    .line 128
    new-instance v1, LF3/g$p;

    .line 129
    .line 130
    iget-object p1, p1, Landroid/os/Message;->replyTo:Landroid/os/Messenger;

    .line 131
    .line 132
    invoke-direct {v1, p1}, LF3/g$p;-><init>(Landroid/os/Messenger;)V

    .line 133
    .line 134
    .line 135
    invoke-virtual {v0, v1}, LF3/g$n;->g(LF3/g$o;)V

    .line 136
    .line 137
    .line 138
    return-void

    .line 139
    :pswitch_3
    const-string v1, "data_root_hints"

    .line 140
    .line 141
    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    .line 142
    .line 143
    .line 144
    move-result-object v7

    .line 145
    invoke-static {v7}, LF3/n;->a(Landroid/os/Bundle;)V

    .line 146
    .line 147
    .line 148
    iget-object v2, p0, LF3/g;->b:LF3/g$n;

    .line 149
    .line 150
    new-instance v3, LF3/g$p;

    .line 151
    .line 152
    iget-object p1, p1, Landroid/os/Message;->replyTo:Landroid/os/Messenger;

    .line 153
    .line 154
    invoke-direct {v3, p1}, LF3/g$p;-><init>(Landroid/os/Messenger;)V

    .line 155
    .line 156
    .line 157
    const-string p1, "data_package_name"

    .line 158
    .line 159
    invoke-virtual {v0, p1}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 160
    .line 161
    .line 162
    move-result-object v4

    .line 163
    const-string p1, "data_calling_pid"

    .line 164
    .line 165
    invoke-virtual {v0, p1}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    .line 166
    .line 167
    .line 168
    move-result v5

    .line 169
    const-string p1, "data_calling_uid"

    .line 170
    .line 171
    invoke-virtual {v0, p1}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    .line 172
    .line 173
    .line 174
    move-result v6

    .line 175
    invoke-virtual/range {v2 .. v7}, LF3/g$n;->c(LF3/g$o;Ljava/lang/String;IILandroid/os/Bundle;)V

    .line 176
    .line 177
    .line 178
    return-void

    .line 179
    :pswitch_4
    iget-object v1, p0, LF3/g;->b:LF3/g$n;

    .line 180
    .line 181
    invoke-virtual {v0, v3}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 182
    .line 183
    .line 184
    move-result-object v2

    .line 185
    invoke-virtual {v0, v4}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 186
    .line 187
    .line 188
    move-result-object v0

    .line 189
    check-cast v0, Ld/b;

    .line 190
    .line 191
    new-instance v3, LF3/g$p;

    .line 192
    .line 193
    iget-object p1, p1, Landroid/os/Message;->replyTo:Landroid/os/Messenger;

    .line 194
    .line 195
    invoke-direct {v3, p1}, LF3/g$p;-><init>(Landroid/os/Messenger;)V

    .line 196
    .line 197
    .line 198
    invoke-virtual {v1, v2, v0, v3}, LF3/g$n;->b(Ljava/lang/String;Ld/b;LF3/g$o;)V

    .line 199
    .line 200
    .line 201
    return-void

    .line 202
    :pswitch_5
    iget-object v1, p0, LF3/g;->b:LF3/g$n;

    .line 203
    .line 204
    invoke-virtual {v0, v3}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 205
    .line 206
    .line 207
    move-result-object v3

    .line 208
    invoke-virtual {v0, v2}, Landroid/os/Bundle;->getBinder(Ljava/lang/String;)Landroid/os/IBinder;

    .line 209
    .line 210
    .line 211
    move-result-object v0

    .line 212
    new-instance v2, LF3/g$p;

    .line 213
    .line 214
    iget-object p1, p1, Landroid/os/Message;->replyTo:Landroid/os/Messenger;

    .line 215
    .line 216
    invoke-direct {v2, p1}, LF3/g$p;-><init>(Landroid/os/Messenger;)V

    .line 217
    .line 218
    .line 219
    invoke-virtual {v1, v3, v0, v2}, LF3/g$n;->d(Ljava/lang/String;Landroid/os/IBinder;LF3/g$o;)V

    .line 220
    .line 221
    .line 222
    return-void

    .line 223
    :pswitch_6
    const-string v1, "data_options"

    .line 224
    .line 225
    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    .line 226
    .line 227
    .line 228
    move-result-object v1

    .line 229
    invoke-static {v1}, LF3/n;->a(Landroid/os/Bundle;)V

    .line 230
    .line 231
    .line 232
    iget-object v4, p0, LF3/g;->b:LF3/g$n;

    .line 233
    .line 234
    invoke-virtual {v0, v3}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 235
    .line 236
    .line 237
    move-result-object v3

    .line 238
    invoke-virtual {v0, v2}, Landroid/os/Bundle;->getBinder(Ljava/lang/String;)Landroid/os/IBinder;

    .line 239
    .line 240
    .line 241
    move-result-object v0

    .line 242
    new-instance v2, LF3/g$p;

    .line 243
    .line 244
    iget-object p1, p1, Landroid/os/Message;->replyTo:Landroid/os/Messenger;

    .line 245
    .line 246
    invoke-direct {v2, p1}, LF3/g$p;-><init>(Landroid/os/Messenger;)V

    .line 247
    .line 248
    .line 249
    invoke-virtual {v4, v3, v0, v1, v2}, LF3/g$n;->a(Ljava/lang/String;Landroid/os/IBinder;Landroid/os/Bundle;LF3/g$o;)V

    .line 250
    .line 251
    .line 252
    return-void

    .line 253
    :pswitch_data_0
    .packed-switch 0x3
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public f(Ljava/lang/String;Landroid/os/Bundle;LF3/g$l;)V
    .locals 0

    .line 1
    const/4 p1, 0x0

    .line 2
    invoke-virtual {p3, p1}, LF3/g$l;->e(Landroid/os/Bundle;)V

    .line 3
    .line 4
    .line 5
    return-void
.end method

.method public abstract g(Ljava/lang/String;ILandroid/os/Bundle;)LF3/g$e;
.end method

.method public abstract h(Ljava/lang/String;LF3/g$l;)V
.end method

.method public i(Ljava/lang/String;LF3/g$l;Landroid/os/Bundle;)V
    .locals 0

    .line 1
    const/4 p3, 0x1

    .line 2
    invoke-virtual {p2, p3}, LF3/g$l;->g(I)V

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, LF3/g;->h(Ljava/lang/String;LF3/g$l;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public j(Ljava/lang/String;LF3/g$l;)V
    .locals 0

    .line 1
    const/4 p1, 0x2

    .line 2
    invoke-virtual {p2, p1}, LF3/g$l;->g(I)V

    .line 3
    .line 4
    .line 5
    const/4 p1, 0x0

    .line 6
    invoke-virtual {p2, p1}, LF3/g$l;->f(Ljava/lang/Object;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public k(Ljava/lang/String;Landroid/os/Bundle;LF3/g$l;)V
    .locals 0

    .line 1
    const/4 p1, 0x4

    .line 2
    invoke-virtual {p3, p1}, LF3/g$l;->g(I)V

    .line 3
    .line 4
    .line 5
    const/4 p1, 0x0

    .line 6
    invoke-virtual {p3, p1}, LF3/g$l;->f(Ljava/lang/Object;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public l(Ljava/lang/String;Landroid/os/Bundle;)V
    .locals 0

    .line 1
    return-void
.end method

.method public m(Ljava/lang/String;)V
    .locals 0

    .line 1
    return-void
.end method

.method n(Ljava/lang/String;Landroid/os/Bundle;LF3/g$f;Ld/b;)V
    .locals 1

    .line 1
    new-instance v0, LF3/g$d;

    .line 2
    .line 3
    invoke-direct {v0, p0, p1, p4}, LF3/g$d;-><init>(LF3/g;Ljava/lang/Object;Ld/b;)V

    .line 4
    .line 5
    .line 6
    iput-object p3, p0, LF3/g;->f:LF3/g$f;

    .line 7
    .line 8
    if-nez p2, :cond_0

    .line 9
    .line 10
    sget-object p3, Landroid/os/Bundle;->EMPTY:Landroid/os/Bundle;

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    move-object p3, p2

    .line 14
    :goto_0
    invoke-virtual {p0, p1, p3, v0}, LF3/g;->f(Ljava/lang/String;Landroid/os/Bundle;LF3/g$l;)V

    .line 15
    .line 16
    .line 17
    const/4 p3, 0x0

    .line 18
    iput-object p3, p0, LF3/g;->f:LF3/g$f;

    .line 19
    .line 20
    invoke-virtual {v0}, LF3/g$l;->b()Z

    .line 21
    .line 22
    .line 23
    move-result p3

    .line 24
    if-eqz p3, :cond_1

    .line 25
    .line 26
    return-void

    .line 27
    :cond_1
    new-instance p3, Ljava/lang/IllegalStateException;

    .line 28
    .line 29
    new-instance p4, Ljava/lang/StringBuilder;

    .line 30
    .line 31
    invoke-direct {p4}, Ljava/lang/StringBuilder;-><init>()V

    .line 32
    .line 33
    .line 34
    const-string v0, "onCustomAction must call detach() or sendResult() or sendError() before returning for action="

    .line 35
    .line 36
    invoke-virtual {p4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    invoke-virtual {p4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    const-string p1, " extras="

    .line 43
    .line 44
    invoke-virtual {p4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    invoke-virtual {p4, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    .line 50
    invoke-virtual {p4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object p1

    .line 54
    invoke-direct {p3, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    throw p3
.end method

.method o(Ljava/lang/String;LF3/g$f;Landroid/os/Bundle;Landroid/os/Bundle;)V
    .locals 7

    .line 1
    new-instance v0, LF3/g$a;

    .line 2
    .line 3
    move-object v4, p1

    .line 4
    move-object v1, p0

    .line 5
    move-object v2, p1

    .line 6
    move-object v3, p2

    .line 7
    move-object v5, p3

    .line 8
    move-object v6, p4

    .line 9
    invoke-direct/range {v0 .. v6}, LF3/g$a;-><init>(LF3/g;Ljava/lang/Object;LF3/g$f;Ljava/lang/String;Landroid/os/Bundle;Landroid/os/Bundle;)V

    .line 10
    .line 11
    .line 12
    iput-object v3, v1, LF3/g;->f:LF3/g$f;

    .line 13
    .line 14
    if-nez v5, :cond_0

    .line 15
    .line 16
    invoke-virtual {p0, v2, v0}, LF3/g;->h(Ljava/lang/String;LF3/g$l;)V

    .line 17
    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    invoke-virtual {p0, v2, v0, v5}, LF3/g;->i(Ljava/lang/String;LF3/g$l;Landroid/os/Bundle;)V

    .line 21
    .line 22
    .line 23
    :goto_0
    const/4 p1, 0x0

    .line 24
    iput-object p1, v1, LF3/g;->f:LF3/g$f;

    .line 25
    .line 26
    invoke-virtual {v0}, LF3/g$l;->b()Z

    .line 27
    .line 28
    .line 29
    move-result p1

    .line 30
    if-eqz p1, :cond_1

    .line 31
    .line 32
    return-void

    .line 33
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 34
    .line 35
    new-instance p2, Ljava/lang/StringBuilder;

    .line 36
    .line 37
    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 38
    .line 39
    .line 40
    const-string p3, "onLoadChildren must call detach() or sendResult() before returning for package="

    .line 41
    .line 42
    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    iget-object p3, v3, LF3/g$f;->a:Ljava/lang/String;

    .line 46
    .line 47
    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    .line 50
    const-string p3, " id="

    .line 51
    .line 52
    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 53
    .line 54
    .line 55
    invoke-virtual {p2, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 56
    .line 57
    .line 58
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object p2

    .line 62
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 63
    .line 64
    .line 65
    throw p1
.end method

.method public onBind(Landroid/content/Intent;)Landroid/os/IBinder;
    .locals 1

    .line 1
    iget-object v0, p0, LF3/g;->a:LF3/g$g;

    .line 2
    .line 3
    invoke-static {v0}, Lt2/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, LF3/g$g;

    .line 8
    .line 9
    invoke-interface {v0, p1}, LF3/g$g;->c(Landroid/content/Intent;)Landroid/os/IBinder;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    return-object p1
.end method

.method public onCreate()V
    .locals 2

    .line 1
    invoke-super {p0}, Landroid/app/Service;->onCreate()V

    .line 2
    .line 3
    .line 4
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 5
    .line 6
    const/16 v1, 0x1c

    .line 7
    .line 8
    if-lt v0, v1, :cond_0

    .line 9
    .line 10
    new-instance v0, LF3/g$k;

    .line 11
    .line 12
    invoke-direct {v0, p0}, LF3/g$k;-><init>(LF3/g;)V

    .line 13
    .line 14
    .line 15
    iput-object v0, p0, LF3/g;->a:LF3/g$g;

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    const/16 v1, 0x1a

    .line 19
    .line 20
    if-lt v0, v1, :cond_1

    .line 21
    .line 22
    new-instance v0, LF3/g$j;

    .line 23
    .line 24
    invoke-direct {v0, p0}, LF3/g$j;-><init>(LF3/g;)V

    .line 25
    .line 26
    .line 27
    iput-object v0, p0, LF3/g;->a:LF3/g$g;

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_1
    new-instance v0, LF3/g$i;

    .line 31
    .line 32
    invoke-direct {v0, p0}, LF3/g$i;-><init>(LF3/g;)V

    .line 33
    .line 34
    .line 35
    iput-object v0, p0, LF3/g;->a:LF3/g$g;

    .line 36
    .line 37
    :goto_0
    iget-object v0, p0, LF3/g;->a:LF3/g$g;

    .line 38
    .line 39
    invoke-interface {v0}, LF3/g$g;->a()V

    .line 40
    .line 41
    .line 42
    return-void
.end method

.method public onDestroy()V
    .locals 1

    .line 1
    iget-object v0, p0, LF3/g;->g:LF3/g$q;

    .line 2
    .line 3
    invoke-virtual {v0}, LF3/g$q;->b()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method p(Ljava/lang/String;LF3/g$f;Ld/b;)V
    .locals 1

    .line 1
    new-instance v0, LF3/g$b;

    .line 2
    .line 3
    invoke-direct {v0, p0, p1, p3}, LF3/g$b;-><init>(LF3/g;Ljava/lang/Object;Ld/b;)V

    .line 4
    .line 5
    .line 6
    iput-object p2, p0, LF3/g;->f:LF3/g$f;

    .line 7
    .line 8
    invoke-virtual {p0, p1, v0}, LF3/g;->j(Ljava/lang/String;LF3/g$l;)V

    .line 9
    .line 10
    .line 11
    const/4 p2, 0x0

    .line 12
    iput-object p2, p0, LF3/g;->f:LF3/g$f;

    .line 13
    .line 14
    invoke-virtual {v0}, LF3/g$l;->b()Z

    .line 15
    .line 16
    .line 17
    move-result p2

    .line 18
    if-eqz p2, :cond_0

    .line 19
    .line 20
    return-void

    .line 21
    :cond_0
    new-instance p2, Ljava/lang/IllegalStateException;

    .line 22
    .line 23
    new-instance p3, Ljava/lang/StringBuilder;

    .line 24
    .line 25
    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    .line 26
    .line 27
    .line 28
    const-string v0, "onLoadItem must call detach() or sendResult() before returning for id="

    .line 29
    .line 30
    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    invoke-direct {p2, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    throw p2
.end method

.method q(Ljava/lang/String;Landroid/os/Bundle;LF3/g$f;Ld/b;)V
    .locals 1

    .line 1
    new-instance v0, LF3/g$c;

    .line 2
    .line 3
    invoke-direct {v0, p0, p1, p4}, LF3/g$c;-><init>(LF3/g;Ljava/lang/Object;Ld/b;)V

    .line 4
    .line 5
    .line 6
    iput-object p3, p0, LF3/g;->f:LF3/g$f;

    .line 7
    .line 8
    invoke-virtual {p0, p1, p2, v0}, LF3/g;->k(Ljava/lang/String;Landroid/os/Bundle;LF3/g$l;)V

    .line 9
    .line 10
    .line 11
    const/4 p2, 0x0

    .line 12
    iput-object p2, p0, LF3/g;->f:LF3/g$f;

    .line 13
    .line 14
    invoke-virtual {v0}, LF3/g$l;->b()Z

    .line 15
    .line 16
    .line 17
    move-result p2

    .line 18
    if-eqz p2, :cond_0

    .line 19
    .line 20
    return-void

    .line 21
    :cond_0
    new-instance p2, Ljava/lang/IllegalStateException;

    .line 22
    .line 23
    new-instance p3, Ljava/lang/StringBuilder;

    .line 24
    .line 25
    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    .line 26
    .line 27
    .line 28
    const-string p4, "onSearch must call detach() or sendResult() before returning for query="

    .line 29
    .line 30
    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    invoke-direct {p2, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    throw p2
.end method

.method r(Ljava/lang/String;LF3/g$f;Landroid/os/IBinder;)Z
    .locals 6

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x1

    .line 3
    const/4 v2, 0x0

    .line 4
    if-nez p3, :cond_1

    .line 5
    .line 6
    :try_start_0
    iget-object p3, p2, LF3/g$f;->g:Ljava/util/HashMap;

    .line 7
    .line 8
    invoke-virtual {p3, p1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object p3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 12
    if-eqz p3, :cond_0

    .line 13
    .line 14
    move v0, v1

    .line 15
    :cond_0
    :goto_0
    iput-object p2, p0, LF3/g;->f:LF3/g$f;

    .line 16
    .line 17
    invoke-virtual {p0, p1}, LF3/g;->m(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    iput-object v2, p0, LF3/g;->f:LF3/g$f;

    .line 21
    .line 22
    return v0

    .line 23
    :catchall_0
    move-exception p3

    .line 24
    goto :goto_2

    .line 25
    :cond_1
    :try_start_1
    iget-object v3, p2, LF3/g$f;->g:Ljava/util/HashMap;

    .line 26
    .line 27
    invoke-virtual {v3, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v3

    .line 31
    check-cast v3, Ljava/util/List;

    .line 32
    .line 33
    if-eqz v3, :cond_0

    .line 34
    .line 35
    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 36
    .line 37
    .line 38
    move-result-object v4

    .line 39
    :cond_2
    :goto_1
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 40
    .line 41
    .line 42
    move-result v5

    .line 43
    if-eqz v5, :cond_3

    .line 44
    .line 45
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object v5

    .line 49
    check-cast v5, LK1/c;

    .line 50
    .line 51
    iget-object v5, v5, LK1/c;->a:Ljava/lang/Object;

    .line 52
    .line 53
    if-ne p3, v5, :cond_2

    .line 54
    .line 55
    invoke-interface {v4}, Ljava/util/Iterator;->remove()V

    .line 56
    .line 57
    .line 58
    move v0, v1

    .line 59
    goto :goto_1

    .line 60
    :cond_3
    invoke-interface {v3}, Ljava/util/List;->isEmpty()Z

    .line 61
    .line 62
    .line 63
    move-result p3

    .line 64
    if-eqz p3, :cond_0

    .line 65
    .line 66
    iget-object p3, p2, LF3/g$f;->g:Ljava/util/HashMap;

    .line 67
    .line 68
    invoke-virtual {p3, p1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 69
    .line 70
    .line 71
    goto :goto_0

    .line 72
    :goto_2
    iput-object p2, p0, LF3/g;->f:LF3/g$f;

    .line 73
    .line 74
    invoke-virtual {p0, p1}, LF3/g;->m(Ljava/lang/String;)V

    .line 75
    .line 76
    .line 77
    iput-object v2, p0, LF3/g;->f:LF3/g$f;

    .line 78
    .line 79
    throw p3
.end method

.method public s(LF3/n$j;)V
    .locals 1

    .line 1
    if-eqz p1, :cond_1

    .line 2
    .line 3
    iget-object v0, p0, LF3/g;->h:LF3/n$j;

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    iput-object p1, p0, LF3/g;->h:LF3/n$j;

    .line 8
    .line 9
    iget-object v0, p0, LF3/g;->a:LF3/g$g;

    .line 10
    .line 11
    invoke-static {v0}, Lt2/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    check-cast v0, LF3/g$g;

    .line 16
    .line 17
    invoke-interface {v0, p1}, LF3/g$g;->d(LF3/n$j;)V

    .line 18
    .line 19
    .line 20
    return-void

    .line 21
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 22
    .line 23
    const-string v0, "The session token has already been set"

    .line 24
    .line 25
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    throw p1

    .line 29
    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 30
    .line 31
    const-string v0, "Session token may not be null"

    .line 32
    .line 33
    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    throw p1
.end method
